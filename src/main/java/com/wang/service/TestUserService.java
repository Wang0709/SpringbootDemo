package com.wang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wang.domain.TestUserMapper;
import com.wang.domain.TestUser;

@Service
public class TestUserService {
	@Autowired
	TestUserMapper testUserMapper;
	
	public List<TestUser> listAll(){
		return testUserMapper.selectAll();
	}

	public int insert(TestUser testUser) {
		return testUserMapper.insert(testUser);
	}

	public int deleteById(int id) {
		return testUserMapper.deleteById(id);
	}
	
}
