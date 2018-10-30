package io.github.iamtw.tinyioc;

/**
 * 
 * @author iamtw
 *
 */
public class BeanDefinition {

	private Object bean;

	private Class<?> beanClass;

	public BeanDefinition() {
	}

	public void setBean(Object bean) {
		this.bean = bean;
	}

	public Class<?> getBeanClass() {
		return beanClass;
	}

	public void setBeanClass(Class<?> beanClass) {
		this.beanClass = beanClass;
	}


	public Object getBean() {
		return bean;
	}

}
