package com.newsoftdemo.day02;

import com.newsoftdemo.day02.service.IAccount3Service;
import com.newsoftdemo.model.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @description（类描述）: 采用注解方式
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day02
 * @className（类名称）: demo_day_04_test
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-08-07 11:44
 * @version（版本）: v1.0
 */
public class demo_day_04_test {
    @Test
    public void testFindAllAccount() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean4.xml");
        IAccount3Service as = ac.getBean("accountService04Impl", IAccount3Service.class);
        List<Account> acs = as.findAllAccount();
        if (null == acs || 0 == acs.size()) {
            System.out.println("没有找到账户数据");
            return;
        }
        for (Account a : acs) {
            System.out.println(a.toString());
        }
    }
}
