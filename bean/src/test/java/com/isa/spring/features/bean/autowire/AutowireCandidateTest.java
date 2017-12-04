package com.isa.spring.features.bean.autowire;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AutowireCandidateTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void shouldAutowire() {
        AutowireCandidate candidate = new AutowireCandidate();

        assertThat(candidate.getApplicationContext()).isNull();
        assertThat(candidate.getEnvironment()).isNull();

        applicationContext.getAutowireCapableBeanFactory().autowireBean(candidate);

        assertThat(candidate.getApplicationContext()).isNotNull();
        assertThat(candidate.getEnvironment()).isNotNull();
    }
}
