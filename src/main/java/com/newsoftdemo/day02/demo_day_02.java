package com.newsoftdemo.day02;

import com.newsoftdemo.day02.dao.IAccountDao;
import com.newsoftdemo.day02.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description（类描述）: TODO
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day02
 * @className（类名称）: demo_day_02
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-08-05 18:36
 * @version（版本）: v1.0
 */
public class demo_day_02 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean2.xml");
        IAccountDao ado = ac.getBean("accountDao02Impl", IAccountDao.class);
        System.out.println(ado);
        IAccountService as = ac.getBean("accountService02Impl", IAccountService.class);
        System.out.println(as);
        as.saveAccount();
        IAccountDao ado2 = ac.getBean("accountDao02Impl", IAccountDao.class);
        System.out.println("测试范围标签：singleton-->ado==ad02");
        System.out.println(ado == ado2);
        IAccountService as2 = ac.getBean("accountService02Impl", IAccountService.class);
        System.out.println("测试范围标签：prototype-->as==as2");
        System.out.println(as2 == as);
        ac.close();
    }
}
