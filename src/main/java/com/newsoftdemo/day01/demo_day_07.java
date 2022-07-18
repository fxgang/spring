package com.newsoftdemo.day01;

import com.newsoftdemo.day01.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * @description（类描述）: TODO
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day01
 * @className（类名称）: demo_day_07
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-07-18 22:11
 * @version（版本）: v1.0
 */
public class demo_day_07 {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = ac.getBean("accountService3", IAccountService.class);
        as.saveAccount();
        System.out.println("实例方法测试完成");
        IAccountService ass = ac.getBean("accountService4", IAccountService.class);
        ass.saveAccount();
        System.out.println("静态方法测试完成");
    }
}
