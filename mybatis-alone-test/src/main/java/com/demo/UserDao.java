package com.demo;

import java.util.List;

/**
 * @author 
 * @date 2017年8月4日 下午4:39:41
 */
public interface UserDao {

	public List<User> getUserById(Integer id);
}
