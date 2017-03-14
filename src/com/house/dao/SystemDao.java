package com.house.dao;

import java.util.Map;

/**
 * 系统设置
 * @author TrueBt
 */
public interface SystemDao {

	/**
	 * 新增
	 * @param queryMap
	 * @throws Exception
	 */
	void insert(Map<String, String> queryMap) throws Exception;

	/**
	 * 更新
	 * @param queryMap
	 * @throws Exception
	 */
	void update(Map<String, String> queryMap) throws Exception;
	
	/**
	 * 删除
	 * @param queryMap
	 * @throws Exception
	 */
	void delete(Map<String, String> queryMap) throws Exception;
	
	
}
