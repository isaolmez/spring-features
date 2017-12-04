package com.isa.spring.features.configuration.file.properties.profileB;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ConfigurationProperties("b")
@Component
@Profile("propB")
public class BProperties {

    private String name;
}
