package com.demo;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws IOException {

        // 配置文件
        String resource = "config/mybatis-setting.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 使用SqlSessionFactoryBuilder从xml配置文件中创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 获取session
        SqlSession session = sqlSessionFactory.openSession();

        // 获取mapper接口的代理对象
        UserDao userDao = session.getMapper(UserDao.class);

        // 调用代理对象方法
        List<User> user = userDao.getUserById(1);

        System.out.println(user);

        // 关闭session
        session.close();
    }
}
