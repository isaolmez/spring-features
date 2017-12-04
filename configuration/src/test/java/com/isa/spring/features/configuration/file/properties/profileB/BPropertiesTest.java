package com.isa.spring.features.configuration.file.properties.profileB;

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
@ActiveProfiles("propB")
public class BPropertiesTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void shouldCreate() {
        BProperties bProperties = context.getBean(BProperties.class);

        assertThat(bProperties).isNotNull();
    }

    @Test
    public void shouldBindProperties() {
        BProperties bProperties = context.getBean(BProperties.class);

        assertThat(bProperties.getName()).isNotNull();
        assertThat(bProperties.getName()).isEqualTo("b1");
    }
}
