package io.github.iamtw.tinyioc;


/**
 * 
 * @author iamtw
 *
 */
public interface BeanFactory {

	Object getBean(String name);

	void registerBeanDefinition(String name, BeanDefinition beanDefinition);

}
