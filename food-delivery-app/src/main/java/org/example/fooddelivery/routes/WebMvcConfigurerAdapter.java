package org.example.fooddelivery.routes;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;

public abstract class WebMvcConfigurerAdapter {
    public abstract void addCorsMappings(CorsRegistry registry);

    public abstract void addResourceHandlers(ResourceHandlerRegistry registry);

    public abstract void configureViewResolvers(ViewResolverRegistry registry);
}
