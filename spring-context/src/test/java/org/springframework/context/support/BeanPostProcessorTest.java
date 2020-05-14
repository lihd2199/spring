package org.springframework.context.support;

import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.tests.sample.beans.TestBean;

/**
 * @program: spring
 * @description: Test BeanPostProcessor
 * @author: li_hd
 * @create: 2020-05-14 17:21
 **/
public class BeanPostProcessorTest {

	@Test
	public void testBeanPostProcessor() {

		StaticApplicationContext staticApplicationContext = new StaticApplicationContext();
		staticApplicationContext.registerSingleton("tb1", TestBean.class);
		staticApplicationContext.registerSingleton("tb2", TestBean.class);
		staticApplicationContext.registerSingleton("SampleForBeanPostProcessor", SampleForBeanPostProcessor.class);
		staticApplicationContext.refresh();

	}

}

class SampleForBeanPostProcessor implements BeanPostProcessor {

	public SampleForBeanPostProcessor() {
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName + "postProcessBeforeInitialization");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName + "postProcessAfterInitialization");
		return bean;
	}
}
