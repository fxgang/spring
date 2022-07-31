package com.newsoftdemo.day02;

import com.newsoftdemo.day02.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description（类描述）: 注解注入
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day02
 * @className（类名称）: demo_day_01
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-07-31 22:15
 * @version（版本）: v1.0
 */
public class demo_day_01 {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean2.xml");
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        as.saveAccount();
    }
}
