package com.house.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.house.dao.SystemDao;
import com.house.service.SystemService;

@Service("systemServiceImpl")
public class SystemServiceImpl implements SystemService {

	@Autowired
	private SystemDao systemDao;
	
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
