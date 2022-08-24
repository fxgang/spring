package com.newsoftdemo.day03.service.impl;

import com.newsoftdemo.day03.dao.IAccountDao;
import com.newsoftdemo.day03.service.IAccountService;
import com.newsoftdemo.model.Account;

import java.util.List;

/**
 * @description（类描述）: 实现方法
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day03.service.impl
 * @className（类名称）: AccountServiceImpl
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-08-24 22:58
 * @version（版本）: v1.0
 */
public class AccountServiceImpl implements IAccountService {

    private IAccountDao dao;

    public void setDao(IAccountDao dao) {
        this.dao = dao;
    }

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

    @Override
    public void transfer(String sourceName, String targetName, Float money) {
        Account source = dao.findAccountByName(sourceName);
        Account target = dao.findAccountByName(targetName);
        source.setMoney(source.getMoney() - money);
        target.setMoney(target.getMoney() + money);
        dao.updateAccount(source);
        dao.updateAccount(target);
    }
}
