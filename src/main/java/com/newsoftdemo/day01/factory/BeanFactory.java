package com.newsoftdemo.day01.factory;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @description（类描述）: 对象工厂类
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day01.factory
 * @className（类名称）: BeanFactory
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-07-10 22:47
 * @version（版本）: v1.0
 */
public class BeanFactory {
    private static Properties props;
    private static Map<String, Object> beans;

    static {
        String propsName = "bean.properties";
        try {
            props = new Properties();
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream(propsName);
            props.load(in);
            beans = new HashMap<>();
        } catch (IOException e) {
            throw new ExceptionInInitializerError(String.format("初始化工厂配置:%s，错误。", propsName));
        }
    }

    public static Object getBean(String beanName) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Object bean = null;
        System.out.println(String.format("工厂名称：%s", beanName));
        if (beans.containsKey(beanName)) {
            bean = beans.get(beanName);
        } else {
            String class_name = props.getProperty(beanName);
            bean = Class.forName(class_name).getDeclaredConstructor().newInstance();
            beans.put(beanName, bean);
        }
        return bean;
    }
}
