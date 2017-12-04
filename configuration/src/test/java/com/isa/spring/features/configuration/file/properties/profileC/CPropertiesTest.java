package com.isa.spring.features.configuration.file.properties.profileC;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("propC")
public class CPropertiesTest {

    @Autowired
    private CProperties properties;

    @Test
    public void shouldBind() {
        assertThat(properties.getNames()).contains("c1", "c2", "c3");
    }

    @Test
    public void shouldBindInteger() {
        System.out.println(Arrays.toString(properties.getAges()));
        assertThat(properties.getAges()).contains(1, 2, 3);
    }
}
