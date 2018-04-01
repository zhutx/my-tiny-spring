package us.codecraft.tinyioc;

import org.junit.Test;
import us.codecraft.tinyioc.factory.AutowireCapableBeanFactory;
import us.codecraft.tinyioc.factory.BeanFactory;

public class BeanFactoryTest {

    @Test
    public void test() {
        // 1.初始化容器BeanFactory
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        // 2.创建BeanDefinition
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("us.codecraft.tinyioc.HelloWorldService");
        // 3.容器注册BeanDefinition
        beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);

        // 4.获取Bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }

}
