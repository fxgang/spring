package com.newsoftdemo.day02;

import com.newsoftdemo.day02.config.SpringConfiguration;
import com.newsoftdemo.day02.service.IAccount3Service;
import com.newsoftdemo.model.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @description（类描述）: 使用配置注解
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day02
 * @className（类名称）: demo_day_05_test
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-08-07 12:31
 * @version（版本）: v1.0
 */
public class demo_day_05_test {
    @Test
    public void testFindAllAccount() {
        //注意JDK版本需要1.8
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        IAccount3Service as = ac.getBean("accountService04Impl", IAccount3Service.class);
        List<Account> acs = as.findAllAccount();
        if (null == acs || 0 == acs.size()) {
            System.out.println("没有找到数据");
            return;
        }
        for (Account a : acs) {
            System.out.println(a.toString());
        }
    }

    @Test
    public void testQueryRunner() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        QueryRunner runner1 = ac.getBean("runner", QueryRunner.class);
        QueryRunner runner2 = ac.getBean("runner", QueryRunner.class);
        System.out.println(runner1);
        System.out.println(runner2);
        System.out.println(runner1 == runner2);
    }
}
