package com.newsoftdemo.day03.dao;

import com.newsoftdemo.model.Account;

import java.util.List;

/**
 * @description（类描述）: TODO
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day03.dao
 * @className（类名称）: IAccountDao
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-08-24 23:02
 * @version（版本）: v1.0
 */
public interface IAccountDao {
    /**
     * 查询所有
     * @return
     */
    List<Account> findAllAccount();

    /**
     * 查询一个
     * @return
     */
    Account findAccountById(Integer accountId);

    /**
     * 保存
     * @param account
     */
    void saveAccount(Account account);

    /**
     * 更新
     * @param account
     */
    void updateAccount(Account account);

    /**
     * 删除
     * @param acccountId
     */
    void deleteAccount(Integer acccountId);

    /**
     * 根据名称查询账户
     * @param accountName
     * @return  如果有唯一的一个结果就返回，如果没有结果就返回null
     *          如果结果集超过一个就抛异常
     */
    Account findAccountByName(String accountName);
}
