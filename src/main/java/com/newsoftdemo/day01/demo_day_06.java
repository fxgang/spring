package com.newsoftdemo.day01;

import com.newsoftdemo.day01.service.IAccountService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.lang.reflect.InvocationTargetException;

/**
 * @description（类描述）: TODO
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day01
 * @className（类名称）: demo_day_06
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-07-18 18:24
 * @version（版本）: v1.0
 */
public class demo_day_06 {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        //#region 使用单例
        //读取完成配置文件后立即创建对象Map
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = (IAccountService) ac.getBean("accountService2");
        as.saveAccount();
        System.out.println("立即创建对象到容器");
        //#endregion
        //#region 使用多例
        Resource res = new ClassPathResource("bean.xml");
        BeanFactory bf = new XmlBeanFactory(res);
        IAccountService bas = bf.getBean("accountService2", IAccountService.class);
        bas.saveAccount();
        System.out.println("延时创建对象到容器");
        //#endregion
    }
}
