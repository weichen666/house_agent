package com.house.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.house.bean.UserBean;
import com.house.dao.UserDao;
import com.house.service.UserService;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public UserBean getUser(Map<String, String> queryMap) throws Exception {
		return userDao.getUser(queryMap);
	}
	
	@Override
	public void save(Map<String, String> queryMap) throws Exception {
		userDao.save(queryMap);
	}
	
	@Override
	public void login(Map<String, String> queryMap) throws Exception {
		
		if(userDao.login(queryMap) <= 0){
			throw new Exception("用户名和密码无效");
		}
		
		
		
	}
}
