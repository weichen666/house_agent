package com.house.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.house.dao.UserDao;
import com.house.service.UserService;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public void insert(Map<String, String> queryMap) throws Exception {
	}

	@Override
	public void update(Map<String, String> queryMap) throws Exception {
	}

	@Override
	public void delete(Map<String, String> queryMap) throws Exception {
	}
	
}
