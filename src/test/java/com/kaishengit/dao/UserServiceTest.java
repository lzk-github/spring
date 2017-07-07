package com.kaishengit.dao;

import com.kaishengit.service.DiDemo;
import com.kaishengit.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lzk on 2017/7/7.
 */
public class UserServiceTest {
    @Test
    public void first() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.save();
    }
    @Test
    public void second() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DiDemo di = (DiDemo) applicationContext.getBean("diDemo");
        di.show();
    }
}
