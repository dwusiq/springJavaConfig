package com.wusiq.componentScan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * java配置类
 * @Configuration 表明该类是个配置类
 * @ComponentScan 自动扫描带有被@Component注解的类，并为其创建bean
 */
@Configuration
@ComponentScan(value="com.wusiq")
public class JavaConfig {
}
