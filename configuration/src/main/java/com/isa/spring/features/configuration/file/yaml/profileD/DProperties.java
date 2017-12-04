package com.isa.spring.features.configuration.file.yaml.profileD;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ConfigurationProperties(prefix = "d")
@Component
@Profile("yamlD")
public class DProperties {

    private String[] names;
}
