package com.hnisc.service;

import com.hnisc.entity.Account;

import java.util.List;

/**
 * @author lh141
 * 账户service接口
 */
public interface AccountService {

    //查询所有账户信息
    public List<Account> findAll();

    //保存账户信息
    public void saveAccount(Account account);
}
