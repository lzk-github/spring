package com.kaishengit.dao;

import com.kaishengit.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author lzk
 * @since 2017/7/7
 * @version 1.0
 *
 */
public class UserDaoTest {
    @Test
    public void save() {
        //1.创建spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从容器中获取对象
//        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
//        userDao.save();
//        applicationContext.close();
    }
}
