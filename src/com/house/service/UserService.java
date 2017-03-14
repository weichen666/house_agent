package com.house.service;

import java.util.Map;

import com.house.bean.UserBean;

public interface UserService {

	/**
	 * 新增
	 * 
	 * @param queryMap
	 * @throws Exception
	 */
	void insert(Map<String, String> queryMap) throws Exception;

	/**
	 * 更新
	 * 
	 * @param queryMap
	 * @throws Exception
	 */
	void update(Map<String, String> queryMap) throws Exception;

	/**
	 * 删除
	 * 
	 * @param queryMap
	 * @throws Exception
	 */
	void delete(Map<String, String> queryMap) throws Exception;

}
