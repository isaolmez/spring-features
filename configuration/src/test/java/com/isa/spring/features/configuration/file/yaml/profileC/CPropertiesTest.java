package com.isa.spring.features.configuration.file.yaml.profileC;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("yamlC")
public class CPropertiesTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void shouldCreate() {
        CProperties cProperties = context.getBean(CProperties.class);

        assertThat(cProperties).isNotNull();
    }

    @Test
    public void shouldBindProperties() {
        CProperties cProperties = context.getBean(CProperties.class);

        assertThat(cProperties.getName()).isNotNull();
        assertThat(cProperties.getName()).isEqualTo("c1");
    }
}
