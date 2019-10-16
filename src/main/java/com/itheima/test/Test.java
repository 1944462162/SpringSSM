package com.itheima.test;

import com.itheima.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: wangJianBo
 * Date: 2019/9/1 11:06
 * Content:
 */
public class Test {

    @org.junit.Test
    public void testService(){
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
       AccountService accountService = (AccountService) applicationContext.getBean("accountService");
       accountService.getAllAccount();
    }
}
