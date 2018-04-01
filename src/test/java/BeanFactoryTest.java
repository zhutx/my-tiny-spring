import org.junit.Test;
import us.codecraft.tinyioc.BeanDefinition;
import us.codecraft.tinyioc.BeanFactory;
import us.codecraft.tinyioc.HelloWorldService;

public class BeanFactoryTest {

    @Test
    public void test() {
        // 1.初始化容器BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.创建BeanDefinition
        BeanDefinition beanDefinition = new BeanDefinition(new HelloWorldService());
        // 3.容器注册BeanDefinition
        beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);

        // 4.获取Bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }

}
