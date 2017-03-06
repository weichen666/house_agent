package com.house.service;

import java.util.Map;

import com.house.bean.UserBean;

public interface UserService {
	
	/**
	 * 获取用户
	 * @param queryMap
	 * @return 
	 */
	UserBean getUser(Map<String, String> queryMap) throws Exception;
	
	/**
	 * 保存
	 * @param queryMap
	 * @throws Exception 
	 */
	void save(Map<String, String> queryMap) throws Exception;
	
	/**
	 * 登录
	 * @param queryMap
	 */
	void login(Map<String, String> queryMap) throws Exception;

}
