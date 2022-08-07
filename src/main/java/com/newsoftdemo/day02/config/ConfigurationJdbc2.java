package com.newsoftdemo.day02.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;

/**
 * @description（类描述）: TODO
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day02.config
 * @className（类名称）: ConfigurationJdbc2
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-08-07 13:49
 * @version（版本）: v1.0
 */
public class ConfigurationJdbc2 {
    @Value("${jdbc.driver}")
    private String driver;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String user;

    @Value("${jdbc.password}")
    private String pass;

    @Bean(name="runner")
    @Scope("prototype")
    public QueryRunner createQueryRunner(@Qualifier("dataSource") DataSource dataSource0){
        return new QueryRunner(dataSource0);
    }

    @Bean(name="dataSource")
    public DataSource createDataSource(){
        try {
            ComboPooledDataSource ds = new ComboPooledDataSource();
            ds.setDriverClass(driver);
            ds.setJdbcUrl(url);
            ds.setUser(user);
            ds.setPassword(pass);
            return ds;
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

    @Bean(name="dataSource2")
    public DataSource createDataSource2(){
        try {
            ComboPooledDataSource ds = new ComboPooledDataSource();
            ds.setDriverClass(driver);
            ds.setJdbcUrl(url);
            ds.setUser(user);
            ds.setPassword(pass);
            return ds;
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }
}
