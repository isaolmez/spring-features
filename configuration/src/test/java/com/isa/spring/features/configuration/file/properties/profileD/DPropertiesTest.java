package com.isa.spring.features.configuration.file.properties.profileD;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("propD")
public class DPropertiesTest {

    @Autowired
    private DProperties properties;

    @Test
    public void shouldBind() {
        assertThat(properties.getNames()).contains("d1", "d2", "d3");
    }
}
