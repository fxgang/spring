package com.newsoftdemo.model;

import java.io.Serializable;

/**
 * @description（类描述）: 用户账户信息
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.model
 * @className（类名称）: User
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-08-05 21:31
 * @version（版本）: v1.0
 */
public class Account implements Serializable {
    private Integer id;
    private String name;
    private Float money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(String.format("账户ID：%d", this.id));
        sb.append(String.format("-->账户名称：%s", this.name));
        sb.append(String.format("-->账户余额：%.2f", this.money));
        return sb.toString();
    }
}
