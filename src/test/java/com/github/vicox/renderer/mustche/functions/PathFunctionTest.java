package com.github.vicox.renderer.mustche.functions;

import com.github.vicox.renderer.UrlBuilder;
import com.github.vicox.renderer.mustache.functions.PathFunction;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * @author Georg Schmidl
 */
public class PathFunctionTest {
    @Test
    public void testApply() throws Exception {

        UrlBuilder urlBuilder = mock(UrlBuilder.class);

        PathFunction pathFunction = new PathFunction(urlBuilder);
        pathFunction.apply("something");
        verify(urlBuilder).buildUrl("something");
    }
}
