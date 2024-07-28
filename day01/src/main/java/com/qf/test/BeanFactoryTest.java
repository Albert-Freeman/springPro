package com.qf.test;

import com.qf.service.UserService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class BeanFactoryTest {
    public static void main(String[] args) {
         // 创建工厂对象
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 创建一个读取器
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        //读取配置文件给工厂
        reader.loadBeanDefinitions("beans.xml");
        // 根据id获取bean实力对象
        UserService userService = (UserService) beanFactory.getBean("userService");
//        System.out.println(userService);
    }
}
