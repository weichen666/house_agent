package com.house.dao;

import java.util.Map;

import com.house.bean.UserBean;

public interface UserDao {
	
	/**
	 * 获取用户
	 * @param queryMap
	 * @return
	 */
	UserBean getUser(Map<String, String> queryMap);
	
	/**
	 * 保存
	 * @param queryMap
	 */
	void save(Map<String, String> queryMap);
	
	/**
	 * 登录
	 * @param queryMap
	 * @return
	 */
	int login(Map<String, String> queryMap);
	
	
	
}
