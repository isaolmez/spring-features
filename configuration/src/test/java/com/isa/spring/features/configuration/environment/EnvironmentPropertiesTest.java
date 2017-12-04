package com.isa.spring.features.configuration.environment;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EnvironmentPropertiesTest {

    @Autowired
    private EnvironmentProperties properties;

    @Test
    public void shouldBind() {
        assertThat(properties.getPath()).isNotBlank();
        assertThat(properties.getPath()).isEqualTo(System.getenv("PATH"));
    }
}
