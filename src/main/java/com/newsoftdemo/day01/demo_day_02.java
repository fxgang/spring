package com.newsoftdemo.day01;

import java.sql.*;

/**
 * @description（类描述）: TODO
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.day01
 * @className（类名称）: demo_day_02
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-07-08 23:19
 * @version（版本）: v1.0
 */
public class demo_day_02 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //注册驱动
        //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.253.128:3306/demo?useUnicode=true&characterEncoding=utf8&useSSL=false", "root", "qaz@123#PY");
        //获取预处理对象
        PreparedStatement pstm = conn.prepareStatement("select * from account");
        //执行SQL语句
        ResultSet rs = pstm.executeQuery();
        //遍历结果集
        while (rs.next()){
            System.out.println(rs.getString("name"));
        }
        rs.close();
        pstm.close();
        conn.close();
    }
}
