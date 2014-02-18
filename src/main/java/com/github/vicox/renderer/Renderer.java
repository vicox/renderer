package com.github.vicox.renderer;

import java.util.Map;

/**
 * @author Georg Schmidl
 */
public interface Renderer {

    String render(String template, Map<String, Object> context, UrlBuilder urlBuilder);
}
