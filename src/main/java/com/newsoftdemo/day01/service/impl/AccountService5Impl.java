package com.newsoftdemo.day01.service.impl;

import com.newsoftdemo.day01.dao.IAccountDao;
import com.newsoftdemo.day01.service.IAccountService;

import java.lang.reflect.InvocationTargetException;

/**
 * @description（类描述）: TODO
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day01.service.impl
 * @className（类名称）: AccountService5Impl
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-07-17 21:44
 * @version（版本）: v1.0
 */
public class AccountService5Impl implements IAccountService {
    private IAccountDao accountDao = null;
    @Override
    public void saveAccount() throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        System.out.println("测试完成");
    }
}
