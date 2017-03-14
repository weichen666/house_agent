package com.house.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.house.dao.MessageDao;
import com.house.service.MessageService;

@Service("messageServiceImpl")
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageDao messageDao;
	
	@Override
	public void insert(Map<String, String> queryMap) throws Exception{
		
	}
	
	@Override
	public void delete(Map<String, String> queryMap) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void update(Map<String, String> queryMap) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
