package com.newsoftdemo.day01.factory;

import com.newsoftdemo.day01.service.IAccountService;
import com.newsoftdemo.day01.service.impl.AccountService7Impl;

/**
 * @description（类描述）: TODO
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day01.factory
 * @className（类名称）: BeanFactoryMethod
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-07-18 22:04
 * @version（版本）: v1.0
 */
public class BeanFactoryMethod {
    public IAccountService getAccountService(){
        return new AccountService7Impl();
    }
    public static IAccountService getStaticAccountService(){
        return new AccountService7Impl();
    }
}
