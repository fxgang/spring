package com.newsoftdemo.day01;

import com.newsoftdemo.day01.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * @description（类描述）: TODO
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day01
 * @className（类名称）: demo_day_08
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-07-29 21:47
 * @version（版本）: v1.0
 */
public class demo_day_08 {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        System.out.println("单例对象生命周期");
        ClassPathXmlApplicationContext ac1 = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as1 = ac1.getBean("accountService81", IAccountService.class);
        as1.saveAccount();
        ac1.close();
        System.out.println("多例对象生命周期");
        ClassPathXmlApplicationContext ac2 = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as2 = ac2.getBean("accountService82", IAccountService.class);
        as2.saveAccount();
        ac2.close();
    }
}
