package io.github.iamtw.tinyioc.factory;

import io.github.iamtw.tinyioc.BeanDefinition;
import io.github.iamtw.tinyioc.PropertyValue;

import java.lang.reflect.Field;

/**
 * 
 * @author Tao Wang
 *
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {


	@Override
	protected Object doCreateBean(BeanDefinition beanDefinition) throws Exception {
		Object bean = createBeanInstance(beanDefinition);
		applyPropertyValues(bean, beanDefinition);
		return bean;
	}

	protected Object createBeanInstance(BeanDefinition beanDefinition) throws Exception {
		return beanDefinition.getBeanClass().newInstance();
	}

	protected void applyPropertyValues(Object bean, BeanDefinition mbd) throws Exception {
		for (PropertyValue propertyValue : mbd.getPropertyValues().getPropertyValues()) {
			Field declaredField = bean.getClass().getDeclaredField(propertyValue.getName());
			declaredField.setAccessible(true);
			declaredField.set(bean, propertyValue.getValue());
		}
	}
}
