package com.isa.spring.features.configuration.file.yaml.profileG;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("yamlG")
public class GPropertiesTest {

    @Autowired
    private GProperties gProperties;

    @Test
    public void shouldBind() {
        assertThat(gProperties.getPeople()).isNotNull();
        assertThat(gProperties.getPeople().size()).isEqualTo(3);
        assertThat(gProperties.getPeople().get("person1")).isNotNull();
    }
}
