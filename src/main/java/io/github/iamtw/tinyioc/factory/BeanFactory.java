package io.github.iamtw.tinyioc.factory;


import io.github.iamtw.tinyioc.BeanDefinition;

/**
 * 
 * @author iamtw
 *
 */
public interface BeanFactory {


	/**
	 * Get bean from container
	 * @param name
	 * @return
	 */
	Object getBean(String name);

	/**
	 * register bean in container
	 * @param name
	 * @param beanDefinition
	 * @throws Exception
	 */
	void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception;

}
