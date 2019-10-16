package com.itheima.controller;

import com.itheima.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: wangJianBo
 * Date: 2019/9/1 15:08
 * Content:
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountServiceImpl accountService;

    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println("表现层查询所有账户....");
        accountService.getAllAccount();
        return "list";
    }
}
