package com.isa.spring.features.configuration.file.properties.profileA;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ConfigurationProperties(prefix = "a")
@Component
@Profile("propA")
public class AProperties {

    private String name;

    private String lastName;
}
