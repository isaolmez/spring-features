package com.isa.spring.features.properties.lesson3.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.Properties;

@Configuration
public class PropertyConfig {

    @Bean
    public PropertySourcesPlaceholderConfigurer properties() throws IOException {
        PropertySourcesPlaceholderConfigurer placeholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        MutablePropertySources propertySources = new MutablePropertySources();
        propertySources.addLast(sourcePropertySource());
        propertySources.addLast(customPropertySource());
        propertySources.addLast(applicationPropertySource());
        placeholderConfigurer.setPropertySources(propertySources);
        placeholderConfigurer.setIgnoreUnresolvablePlaceholders(true);
        return placeholderConfigurer;
    }

    @Bean
    public PropertySource sourcePropertySource() throws IOException {
        Resource source = new ClassPathResource("source.properties");
        Properties properties = new Properties();
        properties.load(source.getInputStream());
        return new PropertiesPropertySource("source", properties);
    }

    @Bean
    public PropertySource customPropertySource() throws IOException {
        Resource source = new ClassPathResource("custom.properties");
        Properties properties = new Properties();
        properties.load(source.getInputStream());
        return new PropertiesPropertySource("custom", properties);
    }

    @Bean
    public PropertySource applicationPropertySource() throws IOException {
        Resource source = new ClassPathResource("application.properties");
        Properties properties = new Properties();
        properties.load(source.getInputStream());
        return new PropertiesPropertySource("application", properties);
    }
}
