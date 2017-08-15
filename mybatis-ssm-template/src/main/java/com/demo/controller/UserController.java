package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by lwx on 2017/8/15.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/getUserById", method = RequestMethod.GET)
    public String getUserById(Integer id,Map map) {
        User user = userService.getUserById(id);
        map.put("user",user);
        System.out.println(user);
        return "sucess";
    }
}
