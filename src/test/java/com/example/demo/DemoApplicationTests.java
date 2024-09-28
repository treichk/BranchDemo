package com.example.demo;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.controller.UserDataController;
import com.example.service.UserDataService;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	UserDataController controller;

	@MockBean
	private UserDataService service;

	@Test
	public void testCaching() throws Exception {
		controller.getUserDataUser("test");
		controller.getUserDataUser("test");

		verify(service, times(1)).getUserData("test");
	}
}
