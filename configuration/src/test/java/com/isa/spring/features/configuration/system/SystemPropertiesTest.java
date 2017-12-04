package com.isa.spring.features.configuration.system;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SystemPropertiesTest {

    @Autowired
    private SystemProperties properties;

    @Test
    public void shouldBind() {
        assertThat(properties.getHome()).isNotBlank();
        assertThat(properties.getHome()).isEqualTo(System.getProperty("java.home"));

        assertThat(properties.getVendor()).isNotBlank();
        assertThat(properties.getVendor()).isEqualTo(System.getProperty("java.vendor"));

        assertThat(properties.getVersion()).isNotBlank();
        assertThat(properties.getVersion()).isEqualTo(System.getProperty("java.version"));
    }
}
