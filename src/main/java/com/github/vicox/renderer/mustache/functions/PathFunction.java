package com.github.vicox.renderer.mustache.functions;

import com.github.mustachejava.TemplateFunction;
import com.github.vicox.renderer.UrlBuilder;

/**
 * @author Georg Schmidl
 */
public class PathFunction implements TemplateFunction {

    private UrlBuilder urlBuilder;

    public PathFunction(UrlBuilder urlBuilder) {
        this.urlBuilder = urlBuilder;
    }

    @Override
    public String apply(String input) {
        return urlBuilder.buildUrl(input);
    }
}
