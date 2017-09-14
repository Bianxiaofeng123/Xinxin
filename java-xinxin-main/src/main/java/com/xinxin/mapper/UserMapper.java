package com.xinxin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

	//组织sql 准备去数据库查询
	public List<Map<String, Object>> getUserList(Map<String, Object> params);
}
