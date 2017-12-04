package com.isa.spring.features.configuration.file.properties.profileA;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;


@Getter
@Setter
@ConfigurationProperties(prefix = "a")
@Profile("propA")
public class APropertiesVersion2 {

    private String name;

    private String lastName;
}
