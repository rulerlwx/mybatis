package com.demo.dao;

import com.demo.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by lwx on 2017/8/15.
 */
@Repository
public interface UserDao {
    User getUserById(Integer id);
}
