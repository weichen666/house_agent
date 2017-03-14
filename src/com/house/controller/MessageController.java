package com.house.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.house.service.MessageService;

@Controller
@RequestMapping("message")
public class MessageController {

	@Autowired
	private MessageService messageService;
	
	
	
	
	
}
