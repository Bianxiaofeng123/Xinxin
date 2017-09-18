package com.xinxin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

	//组织sql 准备去数据库查询
	public List<Map<String, Object>> getUserList(Map<String, Object> params);
	
	
	//需求 是  我调用这个接口的时候，会传一个名为 name 的模糊条件关键字 然后找出与之匹配的用户列表信息
	public List<Map<String, Object>> getUserList2(Map<String, Object> params);
	
	//小欣欣的接口
	public List<Map<String, Object>> getUserList3(Map<String, Object> params);
}
