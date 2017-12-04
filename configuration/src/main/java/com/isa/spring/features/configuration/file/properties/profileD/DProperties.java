package com.isa.spring.features.configuration.file.properties.profileD;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "d")
@Getter
@Setter
@Profile("propD")
public class DProperties {

    private String[] names;

    private Integer[] ages;
}
