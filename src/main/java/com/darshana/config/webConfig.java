/*
package com.darshana.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Configuration
@ComponentScan(basePackages = "com.darshana")
public class webConfig implements WebMvcConfigurer {

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer
                .defaultContentType(MediaType.TEXT_HTML)
                .ignoreAcceptHeader(true);
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/jsp/", ".jsp").viewClass(JstlView.class);
        registry.enableContentNegotiation(
                new MappingJackson2JsonView()
        );
    }

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/js/**").addResourceLocations("/ui/js/");
        registry.addResourceHandler("/css/**").addResourceLocations("/ui/css/");
    }


}
*/
