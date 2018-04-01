package us.codecraft.tinyioc;

import org.junit.Test;
import us.codecraft.tinyioc.factory.AutowireCapableBeanFactory;
import us.codecraft.tinyioc.factory.BeanFactory;

public class BeanFactoryTest {

    @Test
    public void test() throws Exception{
        // 1.初始化容器BeanFactory
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        // 2.创建BeanDefinition
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("us.codecraft.tinyioc.HelloWorldService");

        // 设置属性
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("text", "Hello World!"));
        beanDefinition.setPropertyValues(propertyValues);

        // 3.容器注册BeanDefinition
        beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);

        // 4.获取Bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }

}
