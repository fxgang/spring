package com.newsoftdemo.day01.service.impl;

import com.newsoftdemo.day01.service.IAccountService;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description（类描述）: TODO
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day01.service.impl
 * @className（类名称）: AccountService9Impl
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-07-29 22:22
 * @version（版本）: v1.0
 */
public class AccountService9Impl implements IAccountService {
    /* 经常变化的数据，不适宜注入 */
    private String name;
    private Integer age;
    private Date birthday;

    public AccountService9Impl(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public void saveAccount() throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        StringBuffer sb = new StringBuffer();
        sb.append(String.format("客户：%s -->", this.name));
        sb.append(String.format("年龄：%d -->", this.age));
        sb.append(String.format("生日：%s", sdf.format(this.birthday)));
        System.out.println(sb.toString());
    }
}
