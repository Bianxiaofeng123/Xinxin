package com.xinxin.mybatis.utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;


/**
 * 读取电脑信息
 * 
 * @author fengfeng
 * @version 1.0 2016-05-13
 * @since 1.0
 */
public class Computer {
	
	 public static void main(String[] args) {
		System.out.println("Computer to start...");
		Computer computer=new Computer();
		System.out.println(computer.getComputerInfo());
	}
	 
	 public Map<String,Object> getComputerInfo() {
		Map<String,Object> resultMap=new HashMap<String,Object>();
		// TODO Auto-generated method stub
		Properties properties = System.getProperties();
		Iterator<Entry<Object, Object>> iterator = properties.entrySet().iterator();
		while (iterator.hasNext()){
		Entry<Object, Object> entry = iterator.next();
		System.out.println(entry.getKey() + "===" + entry.getValue());
		resultMap.put(entry.getKey()+"", entry.getValue());
		}
		return resultMap;
	}
}
