package com.newsoftdemo.day01.service.impl;

import com.newsoftdemo.day01.dao.IAccountDao;
import com.newsoftdemo.day01.dao.impl.AccountDaoImpl;
import com.newsoftdemo.day01.factory.BeanFactory;
import com.newsoftdemo.day01.service.IAccountService;
import java.lang.reflect.InvocationTargetException;

/**
 * @description（类描述）: 工厂模式解码持久层
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day01.service.impl
 * @className（类名称）: AccountService2Impl
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-07-09 23:17
 * @version（版本）: v1.0
 */
public class AccountService2Impl implements IAccountService {
    private IAccountDao accountDao = null;
    @Override
    public void saveAccount() throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        accountDao = (IAccountDao)BeanFactory.getBean("accountDao");
        accountDao.saveAccount();
    }
}
