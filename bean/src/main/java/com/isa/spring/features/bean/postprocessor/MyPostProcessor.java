package com.isa.spring.features.bean.postprocessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("Inside 'Before Initialization'");
        if (bean instanceof Sample) {
            log.info("Value: {}", ((Sample) bean).getName());
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Inside 'After Initialization'");
        if (bean instanceof Sample) {
            log.info("Value: {}", ((Sample) bean).getName());
        }

        return bean;
    }
}
