package com.itheima.service.impl;

import com.itheima.domain.AccountDaomain;
import com.itheima.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: wangJianBo
 * Date: 2019/9/1 10:59
 * Content:
 */

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Override
    public List<AccountDaomain> getAllAccount() {
        System.out.println("保存了账户信息");
        return null;
    }

    @Override
    public void saveAccout(AccountDaomain accountDaomain) {

    }
}
