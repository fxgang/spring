package com.newsoftdemo.day02;

import com.newsoftdemo.day02.config.ConfigurationRoot;
import com.newsoftdemo.day02.service.IAccount3Service;
import com.newsoftdemo.model.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @description（类描述）: spring整合junit，使用配置类
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day02
 * @className（类名称）: spring_junit_02
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-08-13 23:28
 * @version（版本）: v1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConfigurationRoot.class)
public class spring_junit_02 {

    @Autowired
    private IAccount3Service as;

    @Test
    public void testFindAllAccount() {
        List<Account> acs = as.findAllAccount();
        if (null == acs || 0 == acs.size()) {
            System.out.println("没有找到数据");
            return;
        }
        for (Account a : acs) {
            System.out.println(a.toString());
        }
    }
}
