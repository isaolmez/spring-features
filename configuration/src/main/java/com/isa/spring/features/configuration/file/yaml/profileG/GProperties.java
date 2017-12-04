package com.isa.spring.features.configuration.file.yaml.profileG;


import java.util.Map;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ConfigurationProperties(prefix = "g")
@Component
@Profile("yamlG")
public class GProperties {

    private Map<String, Person> people;

    @Getter
    @Setter
    public static class Person {

        private String name;

        private String age;
    }
}
