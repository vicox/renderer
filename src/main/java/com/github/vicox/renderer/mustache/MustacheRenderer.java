package com.github.vicox.renderer.mustache;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;
import com.github.vicox.renderer.Renderer;
import com.github.vicox.renderer.UrlBuilder;
import com.github.vicox.renderer.mustache.functions.PathFunction;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Georg Schmidl
 */
public class MustacheRenderer implements Renderer {

    public String render(String template, Map<String, Object> context, UrlBuilder urlBuilder) {
        if (context == null) {
            context = new HashMap<String, Object>();
        }
        context.put("path", new PathFunction(urlBuilder));

        StringWriter writer = new StringWriter();

        MustacheFactory mf = new DefaultMustacheFactory();
        Mustache mustache = mf.compile(template + ".mustache");
        mustache.execute(writer, context);

        return writer.toString();
    }
}
