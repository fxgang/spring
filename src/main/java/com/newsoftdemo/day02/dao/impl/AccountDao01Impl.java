package com.newsoftdemo.day02.dao.impl;

import com.newsoftdemo.day02.dao.IAccountDao;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description（类描述）: TODO
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day02.dao.impl
 * @className（类名称）: AccountDao01Impl
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-07-31 22:24
 * @version（版本）: v1.0
 */
public class AccountDao01Impl implements IAccountDao {
    @Override
    public void saveAccount() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dt = new Date();
        System.out.println(String.format("%s：保存数据到数据库成功... ...", sdf.format(dt)));
    }
}
