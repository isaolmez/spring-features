package com.isa.spring.features.configuration.file.yaml.profileF;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("yamlF")
public class FPropertiesTest {

    @Autowired
    private FProperties fProperties;

    @Test
    public void shouldBind() {
        assertThat(fProperties.getPeople()).isNotNull();
        assertThat(fProperties.getPeople().size()).isEqualTo(3);
    }
}
