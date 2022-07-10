package com.newsoftdemo.day01.dao.impl;

import com.newsoftdemo.day01.dao.IAccountDao;
import com.newsoftdemo.day01.utils.Utils;

import java.io.UnsupportedEncodingException;

/**
 * @description（类描述）: TODO
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day01.dao.impl
 * @className（类名称）: AccountDaoImpl
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-07-09 22:19
 * @version（版本）: v1.0
 */
public class AccountDaoImpl implements IAccountDao {
    @Override
    public void saveAccount() {
        String msg = "账号信息已经保存";
        System.out.println("账号信息已经保存");
    }
}
