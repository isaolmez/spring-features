package com.isa.spring.features.properties.lesson1.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.PropertySource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@Service
public class PropertyUserService {

    private final PropertySource propertySource;

    @Value("${custom.key}")
    private String customKey;

    @Value("${source.key}")
    private String sourceKey;

    @Value("${app.key}")
    private String appKey;

    @Autowired
    public PropertyUserService(PropertySource propertySource) {
        this.propertySource = propertySource;
    }

    @PostConstruct
    public void init() {
        log.info("Property source name: {}", propertySource.getName());
        log.info("Property source key: {}", propertySource.getProperty("source.key"));
        log.info("custom.key: {}", customKey);
        log.info("source.key: {}", sourceKey);
        log.info("app.key: {}", appKey);
    }
}
