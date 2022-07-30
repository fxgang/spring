package com.newsoftdemo.day01.service.impl;

import com.newsoftdemo.day01.service.IAccountService;
import com.newsoftdemo.model.Course;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @description（类描述）: TODO
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day01.service.impl
 * @className（类名称）: AccountService10Impl
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-07-30 22:00
 * @version（版本）: v1.0
 */
public class AccountService10Impl implements IAccountService {

    private String name;
    private Integer age;
    private Date birthday;
    private String[] course;
    private List<String> interest;
    private Set<String> teacher;
    private Map<String, Course> score;
    private Properties specialty;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }

    public void setInterest(List<String> interest) {
        this.interest = interest;
    }

    public void setTeacher(Set<String> teacher) {
        this.teacher = teacher;
    }

    public void setScore(Map<String, Course> score) {
        this.score = score;
    }

    public void setSpecialty(Properties specialty) {
        this.specialty = specialty;
    }

    @Override
    public void saveAccount() throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        StringBuffer sb = new StringBuffer();
        sb.append(String.format("客户：%s -->", this.name));
        sb.append(String.format("年龄：%d -->", this.age));
        sb.append(String.format("生日：%s", sdf.format(this.birthday)));
        System.out.println(sb.toString());
        System.out.println("------------------------------------------------");
        sb = new StringBuffer();
        sb.append("我学习的课程：");
        for (String s : course) {
            sb.append(String.format("%s、", s));
        }
        System.out.println(sb.toString());
        System.out.println("------------------------------------------------");
        sb = new StringBuffer();
        sb.append("我报名的学习班：");
        for (String s : interest) {
            sb.append(String.format("%s、", s));
        }
        System.out.println(sb.toString());
        System.out.println("------------------------------------------------");
        sb = new StringBuffer();
        sb.append("我的授课教师有：");
        for (String s : teacher) {
            sb.append(String.format("%s、", s));
        }
        System.out.println(sb.toString());
        System.out.println("------------------------------------------------");
        DecimalFormat ddf = new DecimalFormat("0.00");
        sb = new StringBuffer();
        sb.append("我的考试成绩：");
        for (Map.Entry<String, Course> item : score.entrySet()) {
            //sb.append(String.format("(%s)--%s：%f-->", item.getKey(), item.getValue().getName(), new BigDecimal(String.valueOf(item.getValue().getScore())).setScale(2, RoundingMode.UP)).toString());
            //sb.append(String.format("(%s)--%s：%s-->", item.getKey(), item.getValue().getName(), ddf.format(item.getValue().getScore())));
            sb.append(String.format("(%s)--%s：%.2f-->", item.getKey(), item.getValue().getName(), item.getValue().getScore()));
        }
        System.out.println(sb.toString());
        System.out.println("------------------------------------------------");
        sb = new StringBuffer();
        sb.append("我的特长：");
        for (String key : specialty.stringPropertyNames()) {
            sb.append(String.format("%s:%s-->", key, specialty.getProperty(key)));
        }
        System.out.println(sb.toString());
    }
}
