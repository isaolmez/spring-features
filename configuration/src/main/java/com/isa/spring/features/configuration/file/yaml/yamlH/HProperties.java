package com.isa.spring.features.configuration.file.yaml.yamlH;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "h")
@Profile("yamlH")
public class HProperties {

    @Getter
    @Setter
    private List<Map<String, NotificationHttpEndpoint>> configuredEndpoints;

    @Getter
    private List<NotificationHttpEndpoint> endpoints = new ArrayList<>();

    @PostConstruct
    public void init() {
        if (configuredEndpoints != null) {
            endpoints = configuredEndpoints.stream().flatMap(entry -> entry.values().stream()).collect(Collectors.toList());
            endpoints.forEach(endpoint -> {
                try {
                    Optional<URL> url = Optional.of(new URL(endpoint.getPattern()));
                    endpoint.setUrl(url);
                } catch (MalformedURLException e) {
                    endpoint.setUrl(Optional.empty());
                }
            });
        }
    }

    @Data
    @NoArgsConstructor
    public static class NotificationHttpEndpoint {

        @Builder
        public NotificationHttpEndpoint(String id, boolean enabled, String pattern, String method, String format) {
            this.id = id;
            this.enabled = enabled;
            this.pattern = pattern;
            this.method = method;
            this.format = format;
            try {
                this.url = Optional.of(new URL(pattern));
            } catch (MalformedURLException e) {
                this.url = Optional.empty();
            }
        }

        private boolean enabled;

        private Optional<URL> url;

        private String id;

        private String pattern;

        private String method;

        private String format;
    }
}