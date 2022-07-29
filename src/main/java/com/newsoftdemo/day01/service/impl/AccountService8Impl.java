package com.newsoftdemo.day01.service.impl;

import com.newsoftdemo.day01.service.IAccountService;

import java.lang.reflect.InvocationTargetException;

/**
 * @description（类描述）: TODO
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day01.service.impl
 * @className（类名称）: AccountService8Impl
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-07-29 21:48
 * @version（版本）: v1.0
 */
public class AccountService8Impl implements IAccountService {

    @Override
    public void saveAccount() throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        System.out.println("完成生命周期测试");
    }

    public AccountService8Impl(){
        System.out.println(String.format("已经实例化-->%s", "AccountService8Impl"));
    }

    /***
     * @description：生命周期.销毁
     * @author：冯孝刚
     * @createDate（创建时间）：2022-07-29 21:55:09
     * @methodsName（方法名称）: AccountService8Destroy
     * @return（返回类型）: void 执行成功返回true 否则返回false
     * @version（版本）: v1.0
     */
    public void AccountService8Destroy(){
        System.out.println(String.format("已经销毁-->%s，实例", "AccountService8Impl"));
    }

    /***
     * @description：生命周期.初始化
     * @author：冯孝刚
     * @createDate（创建时间）：2022-07-29 21:55:33
     * @methodsName（方法名称）: AccountService8Init
     * @return（返回类型）: void 执行成功返回true 否则返回false
     * @version（版本）: v1.0
     */
    public void AccountService8Init(){
        System.out.println(String.format("已经初始化-->%s，实例", "AccountService8Impl"));
    }
}
