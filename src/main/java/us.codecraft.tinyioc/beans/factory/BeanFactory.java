package us.codecraft.tinyioc.beans.factory;

import us.codecraft.tinyioc.beans.BeanDefinition;

public interface BeanFactory {

    // 获取到Bean
    Object getBean(String name) throws Exception;

}
