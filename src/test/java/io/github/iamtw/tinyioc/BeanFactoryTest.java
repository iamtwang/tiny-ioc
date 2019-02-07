package io.github.iamtw.tinyioc;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class BeanFactoryTest {
	
	private BeanFactory beanFactory;

	@Before
	public void setUp() throws Exception {
		beanFactory = new BeanFactory();	
	}


	@Test
	public void testGetBean() {
		BeanDefinition beanDefinition = new BeanDefinition(new DummyService());
		beanFactory.registerBeanDefinition("dummyService", beanDefinition);
		DummyService service = (DummyService) beanFactory.getBean("dummyService");
		assertNotNull(service);
	}


	
	private class DummyService{
	}

}
