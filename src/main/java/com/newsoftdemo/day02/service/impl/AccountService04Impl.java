package com.newsoftdemo.day02.service.impl;

import com.newsoftdemo.day02.dao.IAccount3Dao;
import com.newsoftdemo.day02.service.IAccount3Service;
import com.newsoftdemo.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description（类描述）: TODO
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day02.service.impl
 * @className（类名称）: AccountService04Impl
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-08-07 11:38
 * @version（版本）: v1.0
 */
@Service("accountService04Impl")
public class AccountService04Impl implements IAccount3Service {

    @Autowired
    @Qualifier("accountDao04Impl")
    private IAccount3Dao dao;

    @Override
    public List<Account> findAllAccount() {
        return dao.findAllAccount();
    }

    @Override
    public Account findAccountById(Integer id) {
        return dao.findAccountById(id);
    }

    @Override
    public void saveAccount(Account account) {
        dao.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        dao.updateAccount(account);
    }

    @Override
    public void deleteAccount(Integer id) {
        dao.deleteAccount(id);
    }
}
