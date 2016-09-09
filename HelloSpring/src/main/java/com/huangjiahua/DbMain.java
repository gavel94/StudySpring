package com.huangjiahua;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by jhhuang on 2016/9/9
 * QQ:781913268
 * Description：测试数据库连接
 */
public class DbMain
{
    private JdbcTemplate jdbcTemplate;
    public void main()
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        jdbcTemplate = ctx.getBean("jdbcTemplate");
//        DruidDataSource dataSource = (DruidDataSource) ctx.getBean("dataSource");
    }

}
