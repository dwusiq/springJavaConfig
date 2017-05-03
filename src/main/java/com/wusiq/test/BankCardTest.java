package com.wusiq.test;

import com.wusiq.config.JavaConfig;
import com.wusiq.service.BankCardService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfig.class)
public class BankCardTest {
    @Autowired
    BankCardService bc;

    @Test
    public void checkBankCard(){
        bc.getMoney();
    }
}
