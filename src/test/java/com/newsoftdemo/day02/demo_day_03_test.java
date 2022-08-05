package com.newsoftdemo.day02;

import com.newsoftdemo.day02.dao.IAccount3Dao;
import com.newsoftdemo.day02.service.IAccount3Service;
import com.newsoftdemo.model.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @description（类描述）: TODO
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day02
 * @className（类名称）: demo_day_03_test
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-08-05 22:53
 * @version（版本）: v1.0
 */
public class demo_day_03_test {
    @Test
    public void testFindAllAccount() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean3.xml");
        IAccount3Service as = ac.getBean("accountService", IAccount3Service.class);
        System.out.println(as);
        List<Account> acs = as.findAllAccount();
        if (null == acs) {
            System.out.println("读取数据错误");
            return;
        }
        for (Account acc : acs) {
            System.out.println(acc.toString());
        }
    }
}
