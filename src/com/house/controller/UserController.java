package com.house.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.house.bean.UserBean;
import com.house.service.UserService;

import net.sf.json.JSONObject;


@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("/getUser")
	public JSONObject getUser(HttpServletRequest request, HttpServletResponse response){
		JSONObject jsonObject = new JSONObject();
		
		Map<String, String> queryMap = new HashMap<String, String>();
		
		UserBean userBean = null;
		
		jsonObject.put("status", "S");
		try
		{
		}catch (Exception ex) {
			jsonObject.put("status", "F");
			jsonObject.put("msg", ex.getMessage());
		}
		
		jsonObject.put("data", userBean);
		
		return jsonObject;
	}
	
	
	/**
	 * 登录
	 * @param request
	 * @param response
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/login")
	public JSONObject login(HttpServletRequest request, HttpServletResponse response){
		JSONObject jsonObject = new JSONObject();
		Map<String, String> queryMap = new HashMap<String, String>();
		queryMap.put("account", request.getParameter("account"));
		queryMap.put("password", request.getParameter("password"));
		
		jsonObject.put("status", "S");
		try{
		}catch (Exception ex) {
			jsonObject.put("status", "F");
			jsonObject.put("msg", ex.getMessage());
		}
		
		return jsonObject;
	}
	
	@ResponseBody
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public JSONObject save(HttpServletRequest request, HttpServletResponse response){
		JSONObject jsonObject = new JSONObject();
		Map<String, String> queryMap = new HashMap<String, String>();
		queryMap.put("account", request.getParameter("account"));
		queryMap.put("password", request.getParameter("password"));
		queryMap.put("email", request.getParameter("email"));
		
		jsonObject.put("status", "S");
		try{
		}catch (Exception ex) {
			jsonObject.put("status", "F");
			jsonObject.put("msg", ex.getMessage());
		}
		
		return jsonObject;
	}
}
