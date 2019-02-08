package io.github.iamtw.tinyioc.factory;

import io.github.iamtw.tinyioc.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class AbstractBeanFactory implements BeanFactory {

    /* Actual Container for Bean */
	private Map<String, BeanDefinition> beanMap = new ConcurrentHashMap<>();

	@Override
    public Object getBean(String name) {
		return beanMap.get(name).getBean();
	}

	@Override
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception{
        Object bean = doCreateBean(beanDefinition);
        beanDefinition.setBean(bean);
        beanMap.put(name, beanDefinition);
	}

    /**
     * create the bean
     * @param beanDefinition
     * @return
     */
    protected abstract Object doCreateBean(BeanDefinition beanDefinition) throws Exception;
	
	
}
