package io.github.iamtw.tinyioc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BeanFactoryTest {

	private BeanFactory beanFactory;

	@Before
	public void setUp() throws Exception {
		beanFactory = new AutowireCapableBeanFactory();
	}

	@Test
	public void testGetBean() {

		BeanDefinition beanDefinition = new BeanDefinition();
		beanDefinition.setBeanClass(Dummy.class);
		beanFactory.registerBeanDefinition("dummyService", beanDefinition);
		Dummy dummy = (Dummy)beanFactory.getBean("dummyService");
		assertNotNull(dummy);
	}


}
