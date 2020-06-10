package org.springframework.context.support.lifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: spring
 * @description:
 * @author: li_hd
 * @create: 2020-06-09 13:51
 **/
@Service
public class OrderService {

	@Autowired
	private UserService userService;

}
