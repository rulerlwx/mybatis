package com.demo.service.impl;

import com.demo.entity.User;
import com.demo.service.UserService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lwx on 2017/8/15.
 */
@Service
public class UserServiceImpl implements UserService {

    private static String NAMESPACE = "com.demo.service.impl.UserServiceImpl.";

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public User getUserById(Integer id) {
        User user = this.sqlSessionTemplate.selectOne(NAMESPACE + "getUserById",id);
        return user;
    }
}
