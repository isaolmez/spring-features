package com.isa.spring.features.configuration.file.yaml.profileC;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ConfigurationProperties("c")
@Component
@Profile("yamlC")
public class CProperties {

    private String name;
}
