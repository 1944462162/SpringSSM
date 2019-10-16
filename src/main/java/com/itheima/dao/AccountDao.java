package com.itheima.dao;

import com.itheima.domain.AccountDaomain;

import java.util.List;

/**
 * Author: wangJianBo
 * Date: 2019/9/1 10:56
 * Content:
 */
public interface AccountDao {

    public List<AccountDaomain> getAllAccount();
    public void saveAccout(AccountDaomain account);
}
