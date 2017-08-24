package com.xinxin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

	public List<Map<String, Object>> getUserList(Map<String, Object> params);
}
