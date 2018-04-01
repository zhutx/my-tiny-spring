package us.codecraft.tinyioc;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {

    // 缓存名称到BeanDefinitaion的映射
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

    // 获取到Bean
    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    // 注册Bean
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }

}
