package com.wusiq.componentScan.test;

import com.wusiq.componentScan.config.JavaConfig;
import com.wusiq.componentScan.service.BankCardService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * 测试类-测试自动扫描和自动装配
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfig.class)
public class BankCardTest {
    @Autowired
    BankCardService bc;

    @Test
    public void checkBankCard(){
        //bc.getMoney();
        assertNotNull(bc);
    }
}
