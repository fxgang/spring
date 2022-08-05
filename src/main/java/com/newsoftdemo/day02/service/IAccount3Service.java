package com.newsoftdemo.day02.service;

import com.newsoftdemo.model.Account;

import java.util.List;

/**
 * @description（类描述）: 账户业务接口
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day02.service
 * @className（类名称）: IAccount2Service
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-08-05 22:10
 * @version（版本）: v1.0
 */
public interface IAccount3Service {
    /***
     * @description：获取账户列表
     * @author：冯孝刚
     * @createDate（创建时间）：2022-08-05 21:42:26
     * @methodsName（方法名称）: findAllAccount
     * @return（返回类型）: java.util.List<com.newsoftdemo.model.Account> 执行成功返回true 否则返回false
     * @version（版本）: v1.0
     */
    List<Account> findAllAccount();

    /***
     * @param id：账户ID
     * @description：根据账户ID获取账户
     * @author：冯孝刚
     * @createDate（创建时间）：2022-08-05 21:43:03
     * @methodsName（方法名称）: findAccountById
     * @return（返回类型）: com.newsoftdemo.model.Account 执行成功返回true 否则返回false
     * @version（版本）: v1.0
     */
    Account findAccountById(Integer id);

    /***
     * @param account：等待保存的账户
     * @description：保存账户
     * @author：冯孝刚
     * @createDate（创建时间）：2022-08-05 21:43:49
     * @methodsName（方法名称）: saveAccount
     * @return（返回类型）: void 执行成功返回true 否则返回false
     * @version（版本）: v1.0
     */
    void saveAccount(Account account);

    /***
     * @param account：等待修改的账户
     * @description：修改账户
     * @author：冯孝刚
     * @createDate（创建时间）：2022-08-05 21:44:26
     * @methodsName（方法名称）: updateAccount
     * @return（返回类型）: void 执行成功返回true 否则返回false
     * @version（版本）: v1.0
     */
    void updateAccount(Account account);

    /***
     * @param id：账户ID
     * @description：根据账户ID删除账户
     * @author：冯孝刚
     * @createDate（创建时间）：2022-08-05 21:45:00
     * @methodsName（方法名称）: deleteAccount
     * @return（返回类型）: void 执行成功返回true 否则返回false
     * @version（版本）: v1.0
     */
    void deleteAccount(Integer id);
}
