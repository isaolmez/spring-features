package com.isa.spring.features.bean.autowire;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

@Getter
@Setter
public class AutowireCandidate {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private Environment environment;
}
