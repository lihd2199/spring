package org.springframework.context.support.lifecycle;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring
 * @description:
 * @author: li_hd
 * @create: 2020-06-09 13:48
 **/
public class LifeCycleTests {

	@Test
	public void lifeCycle(){

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

		final UserService bean = applicationContext.getBean(UserService.class);

		bean.outOrderService();


	}


}
