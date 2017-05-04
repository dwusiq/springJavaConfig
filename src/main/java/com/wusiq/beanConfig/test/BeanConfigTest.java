package com.wusiq.beanConfig.test;

import com.wusiq.beanConfig.service.DogBehaviorService;
import com.wusiq.componentScan.config.JavaConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * bean的显式配置的测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfig.class)
public class BeanConfigTest {

    @Autowired
    DogBehaviorService BlackDogBehaviorServiceImpl;

    @Test
    public void checkBankCard(){
     /*   ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        DogBehaviorService course = ctx.getBean(BlackDogBehaviorServiceImpl.class);
        course.run();*/
        BlackDogBehaviorServiceImpl.run();
    }
}