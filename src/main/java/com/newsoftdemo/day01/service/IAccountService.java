package com.newsoftdemo.day01.service;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;

/**
 * @description（类描述）: 业务层接口
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day01.service
 * @className（类名称）: IAccountService
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-07-09 22:12
 * @version（版本）: v1.0
 */
public interface IAccountService {
    void saveAccount() throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException;
}
