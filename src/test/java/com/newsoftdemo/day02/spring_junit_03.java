package com.newsoftdemo.day02;

import com.newsoftdemo.day01.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description（类描述）: spring整合junit，使用xml
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day02
 * @className（类名称）: spring_junit_03
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-08-13 23:57
 * @version（版本）: v1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class spring_junit_03 {
    @Autowired
    @Qualifier("accountService82")
    private IAccountService as;

    @Test
    public void saveAccount() {
        try{
            as.saveAccount();
        }catch (Exception ex){
            System.out.println(String.format("执行异常：%s", ex.getStackTrace().toString()));
        }
    }
}
