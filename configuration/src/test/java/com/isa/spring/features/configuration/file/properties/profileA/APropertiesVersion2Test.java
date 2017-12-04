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
public class APropertiesVersion2Test {

    @Autowired
    private ApplicationContext context;

    @Test
    public void shouldCreate() {
        APropertiesVersion2 propertiesV2 = context.getBean(APropertiesVersion2.class);

        assertThat(propertiesV2).isNotNull();
    }

    @Test
    public void shouldBindProperties() {
        APropertiesVersion2 propertiesV2 = context.getBean(APropertiesVersion2.class);

        assertThat(propertiesV2.getName()).isNotNull();
        assertThat(propertiesV2.getName()).isEqualTo("a1");
    }
}
