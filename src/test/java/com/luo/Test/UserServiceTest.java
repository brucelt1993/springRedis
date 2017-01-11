package com.luo.Test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.luo.Redis.service.UserService;

public class UserServiceTest extends BaseTestCase {
	@Autowired
	private UserService  userService;

	@Test
	public void getUserInfo() {
		System.out.println(userService.selectUserByID(1));
	}
}
