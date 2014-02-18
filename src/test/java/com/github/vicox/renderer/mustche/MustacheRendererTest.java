package com.github.vicox.renderer.mustche;

import com.github.vicox.renderer.Renderer;
import com.github.vicox.renderer.UrlBuilder;
import com.github.vicox.renderer.mustache.MustacheRenderer;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Georg Schmidl
 */
public class MustacheRendererTest {
    @Test
    public void testRender() throws Exception {
        Renderer renderer = new MustacheRenderer();

        String result;

        result = renderer.render("name", null, null);
        assertEquals("", result);

        Map<String, Object> context = new HashMap<String, Object>();
        context.put("name", "John");

        result = renderer.render("name", context, null);
        assertEquals("John", result);

        UrlBuilder urlBuilder = mock(UrlBuilder.class);
        when(urlBuilder.buildUrl(anyObject())).thenReturn("testUrl");

        MustacheRenderer mustacheRenderer = new MustacheRenderer();

        result = mustacheRenderer.render("route", null, urlBuilder);
        assertEquals("testUrl", result);

    }
}
