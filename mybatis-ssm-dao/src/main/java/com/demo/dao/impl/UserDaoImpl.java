package com.demo.dao.impl;

import com.demo.dao.UserDao;
import com.demo.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lwx on 2017/8/15.
 */
@Repository
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    public User getUserById(Integer id) {
        SqlSession sqlSession = this.getSqlSession();//从工厂处获取一个session
        User user = sqlSession.selectOne("com.demo.dao.UserDao.getUserById",id);//执行查询
        return user;
    }
}
