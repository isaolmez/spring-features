package com.isa.spring.features.bean.postprocessor;

import javax.annotation.PostConstruct;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Sample {

    private String name = "initial";

    @PostConstruct
    public void initialize() {
        name = "post-construct";
    }
}
