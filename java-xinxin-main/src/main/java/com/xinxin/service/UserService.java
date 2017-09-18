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
	
	//做业务处理
	public List<Map<String, Object>> getUserList(Map<String, Object> params) {
		//实例化一个 参数类型为 List<Map<String, Object>> 的参数 名字为list
		//接数据 调用另一个盒子 的返回的数据
		List<Map<String, Object>> list=new ArrayList<Map<String, Object>>();
		list=userMapper.getUserList(params);
		return list;
	}
	
	public List<Map<String, Object>> getUserList2(Map<String, Object> params) {
		//实例化一个 参数类型为 List<Map<String, Object>> 的参数 名字为list
		//接数据 调用另一个盒子 的返回的数据
		List<Map<String, Object>> list=new ArrayList<Map<String, Object>>();
		list=userMapper.getUserList2(params);
		return list;
	}
	
	public List<Map<String, Object>> getUserList3(Map<String, Object> params) {
		//实例化一个 参数类型为 List<Map<String, Object>> 的参数 名字为list
		//接数据 调用另一个盒子 的返回的数据
		List<Map<String, Object>> list=new ArrayList<Map<String, Object>>();
		list=userMapper.getUserList3(params);
		return list;
	}
}
