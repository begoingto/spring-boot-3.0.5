package com.begoingto.sbdemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ResourceHandleConfig implements WebMvcConfigurer {

    @Value("${classpath.server}")
    private String pathServer;

    @Value("${classpath.client}")
    private String pathClent;

    @Value("${file.server}")
    private String fileServer;

    @Value("${file.client}")
    private String fileClient;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(this.pathClent)
                .addResourceLocations("classpath:"+ this.pathServer);
        registry.addResourceHandler(this.fileClient)
                .addResourceLocations("file:"+ this.fileServer);
    }
}
