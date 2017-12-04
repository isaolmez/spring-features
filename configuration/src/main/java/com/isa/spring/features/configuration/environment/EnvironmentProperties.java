package com.isa.spring.features.configuration.environment;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties
@Component
@Getter
@Setter
public class EnvironmentProperties {

    private String path;
}
