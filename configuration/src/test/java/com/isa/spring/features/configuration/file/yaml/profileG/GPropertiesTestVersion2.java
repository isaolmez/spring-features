package com.isa.spring.features.configuration.file.yaml.profileG;

import static org.assertj.core.api.Assertions.assertThat;

import com.isa.spring.features.configuration.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Application.class, initializers = ConfigFileApplicationContextInitializer.class)
@ActiveProfiles("yamlG")
public class GPropertiesTestVersion2 {

    @Autowired
    private GProperties gProperties;

    @Test
    public void shouldBind() {
        assertThat(gProperties.getPeople()).isNotNull();
        assertThat(gProperties.getPeople().size()).isEqualTo(3);
    }
}
