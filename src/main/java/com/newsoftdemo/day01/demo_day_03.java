package com.newsoftdemo.day01;

import com.newsoftdemo.day01.service.IAccountService;
import com.newsoftdemo.day01.service.impl.AccountServiceImpl;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;

/**
 * @description（类描述）: TODO
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day01
 * @className（类名称）: demo_day_03
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-07-09 22:10
 * @version（版本）: v1.0
 */
public class demo_day_03 {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        IAccountService as = new AccountServiceImpl();
        as.saveAccount();
        System.out.println("类耦合测试，标准三层结构");
    }
}