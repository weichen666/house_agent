package com.house.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.house.dao.BulidingDao;
import com.house.service.BulidingService;

/**
 * 房屋信息
 * @author TrueBt
 *
 */
@Service("bulidingServiceImpl")
public class BulidingServiceImpl implements BulidingService {

	@Autowired
	private BulidingDao bulidingDao;
	
	@Override
	public void insert(Map<String, String> queryMap) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Map<String, String> queryMap) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Map<String, String> queryMap) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
