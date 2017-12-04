package com.isa.spring.features.configuration;

import com.isa.spring.features.configuration.file.properties.profileA.APropertiesVersion2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(APropertiesVersion2.class)
@Slf4j
public class Application {

    public static void main(String[] args) {
        log.error("asdf {}", "isa", new RuntimeException("Planned exception"));
        new SpringApplicationBuilder()
                .sources(Application.class)
                .profiles("propA", "propB", "yamlC", "yamlD", "yamlE", "yamlF", "yamlG")
                .run(args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println("Order me anything!");
        };
    }
}
