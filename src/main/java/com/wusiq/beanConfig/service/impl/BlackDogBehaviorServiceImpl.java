package com.wusiq.beanConfig.service.impl;

import com.wusiq.beanConfig.service.DogBehaviorService;
import org.springframework.stereotype.Component;

/**
 * 黑狗的行为
 */
@Component
public class BlackDogBehaviorServiceImpl implements DogBehaviorService {
    private String dogName = "大黑狗";
    @Override
    public void run() {
        System.out.println(dogName+ "run quickly");
    }
}
