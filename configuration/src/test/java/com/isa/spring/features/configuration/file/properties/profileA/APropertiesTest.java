package com.isa.spring.features.configuration.file.properties.profileA;

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
@ActiveProfiles("propA")
public class APropertiesTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void shouldCreate() {
        AProperties aProperties = context.getBean(AProperties.class);

        assertThat(aProperties).isNotNull();
    }

    @Test
    public void shouldBindProperties() {
        AProperties aProperties = context.getBean(AProperties.class);

        assertThat(aProperties.getName()).isNotNull();
        assertThat(aProperties.getName()).isEqualTo("a1");
    }
}
