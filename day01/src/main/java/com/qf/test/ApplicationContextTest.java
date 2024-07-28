package com.qf.test;

import com.qf.service.UserService;
import com.qf.service.dao.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserDao userDao = (UserDao)applicationContext.getBean("userDao10");
        userDao.show2();

    }

}
