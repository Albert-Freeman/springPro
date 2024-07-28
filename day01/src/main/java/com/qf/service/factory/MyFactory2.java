package com.qf.service.factory;

import com.qf.service.dao.UserDao;
import com.qf.service.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class MyFactory2 implements FactoryBean<UserDao> {
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
