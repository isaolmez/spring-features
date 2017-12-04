package com.isa.spring.features.configuration.file.yaml.profileE;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("yamlE")
public class EPropertiesTest {

    @Autowired
    private EProperties eProperties;

    @Test
    public void shouldBind() {
        assertThat(eProperties.getPerson()).isNotNull();
        assertThat(eProperties.getPerson().getName()).isEqualTo("e1");
        assertThat(eProperties.getPerson().getAge()).isEqualTo("1");
    }
}
