package com.newsoftdemo.day01;

import com.newsoftdemo.day01.factory.BeanFactory;
import com.newsoftdemo.day01.service.IAccountService;
import com.newsoftdemo.day01.service.impl.AccountService2Impl;

import java.lang.reflect.InvocationTargetException;

/**
 * @description（类描述）: 工厂模式解耦业务层
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo
 * @className（类名称）: demo_day_04
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-07-09 23:14
 * @version（版本）: v1.0
 */
public class demo_day_04 {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {

        IAccountService as = (IAccountService)BeanFactory.getBean("accountService");
        System.out.println(as);
        as.saveAccount();
        System.out.println("已经实现单例");
        //#region 单例验证
        /*
        IAccountService as1 = (IAccountService)BeanFactory.getBean("accountService");
        System.out.println(as1);
        as.saveAccount();
        */
        //#endregion
    }
}
