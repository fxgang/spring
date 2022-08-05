package com.newsoftdemo.day02.service.impl;

import com.newsoftdemo.day02.dao.IAccountDao;
import com.newsoftdemo.day02.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description（类描述）: TODO
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day02.service.impl
 * @className（类名称）: AccountService02Impl
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-08-05 18:42
 * @version（版本）: v1.0
 */
@Service("accountService02Impl")
@Scope("singleton")
public class AccountService02Impl implements IAccountService {
    private IAccountDao dao = null;

    @Resource(name = "accountDao022Impl")
    private IAccountDao dao2 = null;

    private String name = null;

    private final String name_def = "纳纳渔科技";

    private Integer age;

    private Date birthday;

    private String[] course;

    private String[] course_def = new String[]{"语文", "数学", "英语"};

    public String[] getCourse_def() {
        return course_def;
    }

    @Autowired
    @Qualifier("accountDao02Impl")
    public void setDao(IAccountDao dao) {
        this.dao = dao;
    }

    @Value(name_def)
    public void setName(String name) {
        this.name = name;
    }

    @Value("#{(26+8)}")
    public void setAge(Integer age) {
        this.age = age;
    }

    @Value("#{new java.text.SimpleDateFormat(\"yyyy-MM-dd\").parse(\"2022-10-01\")}")
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Value("#{new com.newsoftdemo.day02.service.impl.AccountService02Impl().course_def}")
    public void setCourse(String[] course) {
        this.course = course;
    }

    @PostConstruct
    public void init(){
        System.out.println("实例化后，执行初始化方法");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("实例化后，完成销毁... ...");
    }

    @Override
    public void saveAccount() {
        System.out.println("准备调用DAO1 (@Autowired)+(@Qualifier)... ...");
        dao.saveAccount();
        System.out.println("完成调用DAO1... ...");
        System.out.println("准备调用DAO2 (@Resource)... ...");
        dao2.saveAccount();
        System.out.println("完成调用DAO2... ...");
        StringBuffer sb = new StringBuffer();
        sb.append("---------------------------------\n");
        sb.append(String.format("学员名称：%s\n", this.name));
        sb.append("---------------------------------\n");
        sb.append(String.format("学员年龄：%d\n", this.age));
        sb.append("---------------------------------\n");
        sb.append(String.format("报名时间：%s\n", new SimpleDateFormat("yyyy-MM-dd").format(this.birthday)));

        sb.append("---------------------------------\n");
        sb.append("报名课程：");
        for(int i=0;i<this.course.length;i++){
            sb.append(String.format("%d--%s", i+1, this.course[i]));
            if(i<this.course.length-1){
                sb.append("、");
            }
        }
        sb.append("\n");
        System.out.println(sb.toString());
    }
}
