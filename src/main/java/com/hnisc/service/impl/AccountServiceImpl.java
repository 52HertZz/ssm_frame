package com.hnisc.service.impl;

import com.hnisc.dao.AccountDao;
import com.hnisc.entity.Account;
import com.hnisc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lh141
 * 账户service实现类
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户信息");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户");
        accountDao.saveAccount(account);
    }
}
