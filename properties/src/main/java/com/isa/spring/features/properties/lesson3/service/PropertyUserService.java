package com.isa.spring.features.properties.lesson3.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@Service
@Profile("lesson3")
public class PropertyUserService {
    @Value("${custom.key}")
    private String customKey;

    @Value("${source.key}")
    private String sourceKey;

    @Value("${app.key}")
    private String appKey;

    @PostConstruct
    public void init() {
        log.info("custom.key: {}", customKey);
        log.info("source.key: {}", sourceKey);
        log.info("app.key: {}", appKey);
    }
}
