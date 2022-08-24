package com.newsoftdemo.day03.dao.impl;

import com.newsoftdemo.day03.dao.IAccountDao;
import com.newsoftdemo.model.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.util.List;

/**
 * @description（类描述）: TODO
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day03.dao.impl
 * @className（类名称）: AccountDaoImpl
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-08-24 23:06
 * @version（版本）: v1.0
 */
public class AccountDaoImpl implements IAccountDao {
    private QueryRunner runner;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    @Override
    public List<Account> findAllAccount() {
        try {
            return runner.query("select id, `name`, money from account", new BeanListHandler<Account>(Account.class));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Account findAccountById(Integer id) {
        try {
            return runner.query("select id, `name`, money from account where id = ?", new BeanHandler<Account>(Account.class), id);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void saveAccount(Account account) {
        try {
            runner.update("insert into account(`name`, money) values(?, ?);", account.getName(), account.getMoney());
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void updateAccount(Account account) {
        try {
            runner.update("update account set `name` = ?, money = ? where id = ?", account.getName(), account.getMoney(), account.getId());
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void deleteAccount(Integer id) {
        try {
            runner.update("delete from account where id = ?", id);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Account findAccountByName(String accountName) {
        try {
            List<Account> accounts = runner.query("select id, `name`, money from account where name = ?", new BeanListHandler<Account>(Account.class), accountName);
            if (null == accounts || 0 == accounts.size()) {
                throw new RuntimeException(String.format("账号：%s--不存在", accountName));
            }
            if (accounts.size() > 1) {
                throw new RuntimeException(String.format("账号：$s--不唯一，联系管路员", accountName));
            }
            return accounts.get(0);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
