package com.isa.spring.features.configuration.file.yaml.profileH;

import static org.assertj.core.api.Assertions.assertThat;

import com.isa.spring.features.configuration.file.yaml.yamlH.HProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("yamlH")
public class HPropertiesTest {

    @Autowired
    private HProperties hProperties;

    @Test
    public void shouldBind() {
        assertThat(hProperties.getEndpoints()).isNotNull();
        assertThat(hProperties.getEndpoints().size()).isEqualTo(2);
        assertThat(hProperties.getEndpoints().get(0).getPattern()).isNotNull();
    }
}
