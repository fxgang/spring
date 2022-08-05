package com.newsoftdemo.day02.dao.impl;

import com.newsoftdemo.day02.dao.IAccountDao;
import org.springframework.stereotype.Repository;

/**
 * @description（类描述）: TODO
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day02.dao.impl
 * @className（类名称）: AccountDao022Impl
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-08-05 18:57
 * @version（版本）: v1.0
 */
@Repository("accountDao022Impl")
public class AccountDao022Impl implements IAccountDao {
    @Override
    public void saveAccount() {
        System.out.println("使用Repository注入后保存数据成功");
    }
}
