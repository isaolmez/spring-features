package com.isa.spring.features.configuration.file.properties.profileC;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "c")
@Getter
@Setter
@Profile("propC")
public class CProperties {

    private String[] names;

    private Integer[] ages;
}
