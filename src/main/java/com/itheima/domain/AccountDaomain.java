package com.itheima.domain;

import java.io.Serializable;

/**
 * Author: wangJianBo
 * Date: 2019/9/1 10:55
 * Content:
 */
public class AccountDaomain implements Serializable {
    private Integer id;
    private String name;
    private String money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "AccountDaomain{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money='" + money + '\'' +
                '}';
    }
}
