package com.xinxin.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xinxin.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
	UserMapper userMapper;
	
	public List<Map<String, Object>> getUserList(Map<String, Object> params) {
		/*List<Map<String, Object>> userList=new ArrayList<Map<String, Object>>();
		userList=userMapper.getUserList(params);
		return userList;*/
		return userMapper.getUserList(params);
	}
}
