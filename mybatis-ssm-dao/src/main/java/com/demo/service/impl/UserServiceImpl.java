package com.demo.service.impl;

import com.demo.dao.UserDao;
import com.demo.entity.User;
import com.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lwx on 2017/8/15.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }

}
