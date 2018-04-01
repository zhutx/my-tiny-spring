package us.codecraft.tinyioc.factory;

import us.codecraft.tinyioc.BeanDefinition;

public interface BeanFactory {

    // 获取到Bean
    Object getBean(String name);

    // 注册Bean
    void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception;

}
