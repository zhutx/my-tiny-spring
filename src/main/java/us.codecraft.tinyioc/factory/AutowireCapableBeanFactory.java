package us.codecraft.tinyioc.factory;

import us.codecraft.tinyioc.BeanDefinition;
import us.codecraft.tinyioc.PropertyValue;

import java.lang.reflect.Field;

public class AutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) throws Exception {
        Object bean = createBeanInstance(beanDefinition);
        // 给Bean实例注入属性
        applyPropertyValues(bean, beanDefinition);
        return bean;
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition) throws Exception {
        return beanDefinition.getBeanClass().newInstance();
    }

    // 给Bean实例注入属性
    protected void applyPropertyValues(Object bean, BeanDefinition beanDefinition) throws Exception {
        // 找出bean中的对应属性，注入属性值
        for (PropertyValue propertyValue : beanDefinition.getPropertyValues().getPropertyValueList()) {
            Field declaredField = bean.getClass().getDeclaredField(propertyValue.getName());
            declaredField.setAccessible(true);
            declaredField.set(bean, propertyValue.getValue());
        }
    }
}
