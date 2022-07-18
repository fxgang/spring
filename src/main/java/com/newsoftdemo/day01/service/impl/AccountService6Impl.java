package com.newsoftdemo.day01.service.impl;

import com.newsoftdemo.day01.service.IAccountService;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description（类描述）: TODO
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day01.service.impl
 * @className（类名称）: AccountService6Impl
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-07-18 18:24
 * @version（版本）: v1.0
 */
public class AccountService6Impl implements IAccountService {
    public AccountService6Impl(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dt = new Date();
        System.out.println(String.format("%s:完成实例化", df.format(dt)));
    }
    @Override
    public void saveAccount() throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        System.out.println("保存账号方法");
    }
}
