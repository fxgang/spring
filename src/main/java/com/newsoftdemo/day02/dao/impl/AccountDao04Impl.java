package com.newsoftdemo.day02.dao.impl;

import com.newsoftdemo.day02.dao.IAccount3Dao;
import com.newsoftdemo.model.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description（类描述）: 持久层.注解
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day02.dao.impl
 * @className（类名称）: AccountDao04Impl
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-08-07 11:35
 * @version（版本）: v1.0
 */
@Repository("accountDao04Impl")
public class AccountDao04Impl implements IAccount3Dao {

    @Autowired
    private QueryRunner runner;

    @Override
    public List<Account> findAllAccount() {
        try{
            return runner.query("select id, `name`, money from account", new BeanListHandler<Account>(Account.class));
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Account findAccountById(Integer id) {
        try{
            return runner.query("select id, `name`, money from account where id = ?", new BeanHandler<Account>(Account.class), id);
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void saveAccount(Account account) {
        try{
            runner.update("insert into account(`name`, money) values(?, ?);", account.getName(), account.getMoney());
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void updateAccount(Account account) {
        try{
            runner.update("update account set `name` = ?, money = ? where id = ?", account.getName(), account.getMoney(), account.getId());
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void deleteAccount(Integer id) {
        try{
            runner.update("delete from account where id = ?", id);
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }
}
