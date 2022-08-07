package com.newsoftdemo.day02.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @description（类描述）: TODO
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day02.config
 * @className（类名称）: ConfigurationRoot2
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-08-07 13:54
 * @version（版本）: v1.0
 */
@Configuration
@ComponentScan("com.newsoftdemo.day02")
@Import(ConfigurationJdbc2.class)
@PropertySource("classpath:jdbcConfig.properties")
public class ConfigurationRoot2 {
}
