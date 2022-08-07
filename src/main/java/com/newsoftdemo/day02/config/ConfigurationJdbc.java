package com.newsoftdemo.day02.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;

/**
 * @description（类描述）: TODO
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day02.config
 * @className（类名称）: ConfigurationJdbc
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-08-07 13:31
 * @version（版本）: v1.0
 */
public class ConfigurationJdbc {
    @Bean(name="runner")
    @Scope("prototype")
    public QueryRunner createQueryRunner(DataSource dataSource){
        return new QueryRunner(dataSource);
    }

    @Bean(name="dataSource")
    public DataSource createDataSource(){
        try {
            ComboPooledDataSource ds = new ComboPooledDataSource();
            ds.setDriverClass("com.mysql.cj.jdbc.Driver");
            ds.setJdbcUrl("jdbc:mysql://192.168.253.128:3306/demo?useUnicode=true&characterEncoding=utf8&useSSL=false");
            ds.setUser("root");
            ds.setPassword("qaz@123#PY");
            return ds;
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }
}
