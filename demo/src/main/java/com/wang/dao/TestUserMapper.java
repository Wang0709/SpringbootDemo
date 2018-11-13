package com.wang.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wang.entity.TestUser;

@Mapper
public interface TestUserMapper {
    int insert(TestUser record);

    List<TestUser> selectAll();

	int deleteById(int id);
}