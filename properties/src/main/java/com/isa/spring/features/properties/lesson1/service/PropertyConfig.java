package com.isa.spring.features.properties.lesson1.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.Properties;

@Configuration
public class PropertyConfig {

    @Bean
    public PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer placeholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        Resource[] resources = new ClassPathResource[]{
                new ClassPathResource("custom.properties"),
                new ClassPathResource("application.properties")};
        placeholderConfigurer.setLocations(resources);
        placeholderConfigurer.setIgnoreUnresolvablePlaceholders(true);
        return placeholderConfigurer;
    }

    @Bean
    public PropertySource propertySource() throws IOException {
        Resource source = new ClassPathResource("source.properties");
        Properties manualProperties = new Properties();
        manualProperties.load(source.getInputStream());
        return new PropertiesPropertySource("source", manualProperties);
    }
}
