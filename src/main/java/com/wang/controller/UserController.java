package com.wang.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wang.entity.TestUser;
import com.wang.service.TestUserService;

@RequestMapping("user")
@RestController
public class UserController {
	@Autowired
	TestUserService testUserService;
	TestUser testUser;
	
	@GetMapping("/list/all")
	public List<TestUser> listAll(){
		return testUserService.listAll();
	}
	
	@GetMapping("/insert")
	public int insert() {
		testUser = new TestUser();
		testUser.setId(2);
		testUser.setName("asdfasdfasdf");
		testUser.setAddress("福建省厦门市");
		testUser.setBirthday(new Date());
		return testUserService.insert(testUser);
	}
	
	@GetMapping("/delete")
	public int deleteById(HttpServletRequest request) {
		return testUserService.deleteById(Integer.parseInt(request.getParameter("id")));
	}
}
