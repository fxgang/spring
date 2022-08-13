package com.newsoftdemo.day02;
/**
 1、应用程序的入口
 main方法
 2、junit单元测试中，没有main方法也能执行
 junit集成了一个main方法
 该方法就会判断当前测试类中哪些方法有 @Test注解
 junit就让有Test注解的方法执行
 3、junit不会管我们是否采用spring框架
 在执行测试方法时，junit根本不知道我们是不是使用了spring框架
 所以也就不会为我们读取配置文件/配置类创建spring核心容器
 4、由以上三点可知
 当测试方法执行时，没有Ioc容器，就算写了Autowired注解，也无法实现注入
 */

import com.newsoftdemo.day02.config.ConfigurationRoot;
import com.newsoftdemo.day02.service.IAccount3Service;
import com.newsoftdemo.model.Account;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @description（类描述）: spring整合junit
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day02
 * @className（类名称）: spring_junit
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-08-13 23:08
 * @version（版本）: v1.0
 */
public class spring_junit_01 {

    private ApplicationContext ac;
    private IAccount3Service as;

    @Before
    public void init(){
        ac = new AnnotationConfigApplicationContext(ConfigurationRoot.class);
        as = ac.getBean("accountService04Impl", IAccount3Service.class);
    }

    @Test
    public void testFindAllAccount() {
        //ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigurationRoot.class);
        //IAccount3Service as = ac.getBean("accountService04Impl", IAccount3Service.class);
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
