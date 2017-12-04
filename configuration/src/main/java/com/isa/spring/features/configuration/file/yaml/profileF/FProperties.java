package com.isa.spring.features.configuration.file.yaml.profileF;


import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ConfigurationProperties(prefix = "f")
@Component
@Profile("yamlF")
public class FProperties {

    private List<Person> people;

    @Getter
    @Setter
    public static class Person {

        private String name;

        private String age;
    }
}
