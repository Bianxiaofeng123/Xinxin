package com.xinxin.evryday;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;

import com.thoughtworks.xstream.mapper.Mapper.Null;



public class xin2017918 {
	public static void main(String[] args) {
		
		
//		Map<String, Object> map=new HashMap<String, Object>();
//		map=null;
//		map.containsKey("asd");
//		map.put("aaa", "111");
//		map.get("aaa").toString();
//		System.out.println(map.get("aaa").toString());
//		
//		map.get("bbb");
//		System.out.println(map.get("bbb"));
//		map.get("bbb").toString();
//		System.out.println(map.get("bbb").toString());
		
//		Integer x = 10 ;
//		x=x+10;
//		System.out.println(x);
//		
//		
//		
//		Map<String, String> thismap = new HashMap<String,String>();
//		thismap.put("xin", "asdf");
//		thismap.put("xin1", "asdf1");
//		thismap.put("xin2", "asdf1");
//		thismap.put("xin3", "asdf1");
//		System.out.println(thismap);
//		
//		thismap.get("xin");
//		System.out.println(thismap.get("xin"));
//		.
		Map<String, Object> mapp1=new HashMap<String, Object>();
		mapp1.put("name", "aaa");
		mapp1.put("age", "12");
		System.out.println("mapp1的样子："+mapp1);

		Map<String, Object> mapp2=new HashMap<String, Object>();
		mapp2.put("name", "bbb");
		mapp2.put("age", "22");
		
		Map<String, Object> mapp3=new HashMap<String, Object>();
		mapp3.put("name", "ccc");
		mapp3.put("age", "51");
		
		List<Map<String, Object>> list=new ArrayList<Map<String, Object>>();
		list.add(mapp1);
		list.add(mapp2);
		list.add(mapp3);
		System.out.println("list:"+list);
		
		for (Map<String, Object> map2 : list) {
			System.out.println("进入foreach循环"+map2);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println("进入for循环"+list.get(i));
		}
	}
	
	
	
}
