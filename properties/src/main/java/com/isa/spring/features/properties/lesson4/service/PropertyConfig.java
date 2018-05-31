package com.isa.spring.features.properties.lesson4.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class PropertyConfig {

    @Bean
    public PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer placeholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        Resource[] resources = new ClassPathResource[]{
                new ClassPathResource("custom.properties"),
                new ClassPathResource("source.properties"),
                new ClassPathResource("application.properties")};
        placeholderConfigurer.setLocations(resources);
        placeholderConfigurer.setIgnoreUnresolvablePlaceholders(true);
        return placeholderConfigurer;
    }
}
