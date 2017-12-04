package com.isa.spring.features.configuration.file.yaml.profileE;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ConfigurationProperties(prefix = "e")
@Component
@Profile("yamlE")
public class EProperties {

    private Person person;

    @Getter
    @Setter
    public static class Person {

        private String name;

        private String age;
    }
}
