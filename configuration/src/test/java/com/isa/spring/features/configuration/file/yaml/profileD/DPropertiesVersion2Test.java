package com.isa.spring.features.configuration.file.yaml.profileD;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("yamlD")
public class DPropertiesVersion2Test {

    @Autowired
    private DPropertiesVersion2 dProperties;

    @Test
    public void shouldBind() {
        assertThat(dProperties.getNames()).isNotNull();
        assertThat(dProperties.getNames()).contains("d1", "d2", "d3");
    }
}
