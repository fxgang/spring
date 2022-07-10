package com.newsoftdemo.day01.service.impl;

import com.newsoftdemo.day01.dao.IAccountDao;
import com.newsoftdemo.day01.dao.impl.AccountDaoImpl;
import com.newsoftdemo.day01.service.IAccountService;

import java.io.UnsupportedEncodingException;

/**
 * @description（类描述）: 业务层实现类
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day01.service.impl
 * @className（类名称）: AccountServiceImpl
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-07-09 22:14
 * @version（版本）: v1.0
 */
public class AccountServiceImpl implements IAccountService {
    private IAccountDao accountDao = new AccountDaoImpl();
    @Override
    public void saveAccount() {
        accountDao.saveAccount();
    }
}
