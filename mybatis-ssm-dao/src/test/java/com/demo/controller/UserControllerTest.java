package com.demo.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;

/**
 * Created by lwx on 2017/8/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)	//①
@WebAppConfiguration        //②
@ContextConfiguration(locations = {"classpath:config/applicationContext.xml",	//③
        "classpath:config/mybatis-setting.xml",
        "classpath:config/springmvc-servlet.xml"})
public class UserControllerTest {

    @Autowired
    UserController userController;	//④

    MockMvc mockMvc;

    @Before
    public void before(){
        mockMvc = MockMvcBuilders.standaloneSetup(userController)		//⑤
                .build();
    }

    @Test
    public void testGetUserById(){
        try {
            this.mockMvc.perform(		//⑥
                    MockMvcRequestBuilders.get("/user/getUserById?id=1")
                            .accept(MediaType.ALL_VALUE));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     ①、②、③，一个都不能少；④是要测试的Controller；⑤是把④中的controller包装成一个模拟的controller；
     ⑥是开始测试controller，模拟http请求和接收返回参数，在此处可以写请求的路径、请求方式（GET/POST/PUT/DELETE）、设置请求参数等。

     要求servlet3.0及以上。

    */
}