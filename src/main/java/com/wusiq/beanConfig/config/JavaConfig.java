package com.wusiq.beanConfig.config;

import com.wusiq.beanConfig.service.DogBehaviorService;
import com.wusiq.beanConfig.service.impl.BlackDogBehaviorServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * java配置，bean的显式配置
 */
@Configuration
public class JavaConfig {
    @Bean
    public DogBehaviorService blackDogBehaviorServiceImpl(){
        return new BlackDogBehaviorServiceImpl();
    }
}
