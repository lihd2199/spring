package org.springframework.context.support;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.tests.sample.beans.TestBean;

/**
 * @program: spring
 * @description: sample for ApplicationListenerTest
 * @author: li_hd
 * @create: 2020-05-14 17:48
 **/
public class ApplicationListenerTest {

	@Test
	public void testApplicationListener() {

		StaticApplicationContext ac = new StaticApplicationContext();
		ac.registerSingleton("tb1", TestBean.class);
		ac.registerSingleton("tb2", TestBean.class);
		ac.registerSingleton("SampleForApplicationListener", SampleForApplicationListener.class);
		ac.refresh();
	}

}

class SampleForApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		final ApplicationContext applicationContext = event.getApplicationContext();
		final TestBean testBean = (TestBean) applicationContext.getBean("tb1");
		// testBean is null
		System.out.println(testBean.hashCode());
	}
}
