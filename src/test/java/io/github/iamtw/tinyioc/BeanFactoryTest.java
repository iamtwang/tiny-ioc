package io.github.iamtw.tinyioc;

import static org.junit.Assert.*;

import io.github.iamtw.tinyioc.factory.AutowireCapableBeanFactory;
import io.github.iamtw.tinyioc.factory.BeanFactory;
import org.junit.Before;
import org.junit.Test;

public class BeanFactoryTest {

	private BeanFactory beanFactory;

	@Before
	public void setUp() throws Exception {
		beanFactory = new AutowireCapableBeanFactory();
	}

	@Test
	public void testGetBean() throws Exception{

		BeanDefinition beanDefinition = new BeanDefinition();
		beanDefinition.setBeanClassName("io.github.iamtw.tinyioc.Dummy");

		PropertyValues propertyValues = new PropertyValues();
		propertyValues.addPropertyValue(new PropertyValue("name", "World!"));
		beanDefinition.setPropertyValues(propertyValues);

		beanFactory.registerBeanDefinition("dummy", beanDefinition);

		Dummy dummy = (Dummy)beanFactory.getBean("dummy");
		String result = dummy.hello();
		assertEquals("Hello World!", result);
	}


}
