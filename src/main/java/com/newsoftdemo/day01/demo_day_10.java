package com.newsoftdemo.day01;

import com.newsoftdemo.day01.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * @description（类描述）: set注入
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day01
 * @className（类名称）: demo_day_10
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-07-30 21:58
 * @version（版本）: v1.0
 */
public class demo_day_10 {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = ac.getBean("accountService92", IAccountService.class);
        as.saveAccount();
    }
}
