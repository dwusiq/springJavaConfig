package com.wusiq.componentScan.service.impl;

import com.wusiq.componentScan.service.BankCardService;
import org.springframework.stereotype.Component;

/**
 * 中国银行的卡处理
 */
@Component
public class ChineseBankCardServiceImpl implements BankCardService {

    /***
     * 取钱
     */
    @Override
    public void getMoney() {
        System.out.println("从中国银行取现金20元");
    }
}
