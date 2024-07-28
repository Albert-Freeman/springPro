package com.qf.service.impl;

import com.qf.service.UserService;
import com.qf.service.dao.UserDao;
import org.springframework.beans.factory.InitializingBean;

public class UserServiceImpl implements UserService, InitializingBean {


    public UserServiceImpl(String name) {
        System.out.println("有参构造方法实例化bean:" + name );
    }

    public void setUserDao(UserDao userDao) {
        System.out.println("BeanFactory调用该方法获得userDao设置到此处" + userDao);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet执行。。。");
    }

    public void init(){
        System.out.println("init。。。");
    }
    public void destroy(){
        System.out.println("destroy...");
    }

    public void test(){
        System.out.println("test");
        System.out.println("test by hot-fix branch");
        System.out.println("modify by master");
        System.out.println("modify by hot-fix");
    }
}
