package com.isa.spring.features.configuration.system;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@ConfigurationProperties(prefix = "java")
@Component
@Getter
@RequiredArgsConstructor
public class SystemProperties {

    @Value("${java.home}")
    private String home;

    @Value("${java.vendor}")
    private String vendor;

    @Value("${java.version}")
    private String version;
}
