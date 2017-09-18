package com.xinxin.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xinxin.mybatis.utils.JsonResult;
import com.xinxin.mybatis.utils.Pager;
import com.xinxin.service.UserService;

@RestController
@RequestMapping(value = "/usr")//这个是主索引  
public class UserController implements Serializable{
	//获取打印权限
	private Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	MessageSource messageSource; 
	
	@Autowired
	UserService u;
	 
		@RequestMapping(value = "/list1",method=RequestMethod.GET)// 这个是spring框架的必要索引
		public JsonResult getUserList(@RequestParam Map<String, Object> params, Pager pager){
			//日志打印
			log.info("--->>>params:"+params);
			//实例化一个 JsonResult 格式的的参数名字叫做 jsonResult
			JsonResult jsonResult = new JsonResult();
			//调用service--调用另外一个盒子
			//实例化一个 参数类型为 List<Map<String, Object>> 的参数 名字为userList
			List<Map<String, Object>> userList=new ArrayList<Map<String, Object>>();
			//接数据 调用另一个盒子 的返回的数据
			userList=u.getUserList(params);
			jsonResult.put(userList);
			return jsonResult;
		}
		
		
		//需求 是  我调用这个接口的时候，会传一个名为 name 的模糊条件关键字 然后找出与之匹配的用户列表信息
		@RequestMapping(value = "/list2",method=RequestMethod.GET)// 这个是spring框架的必要索引
		//		返回参数格式           自定义方法名                 注解		    前台参数格式       		       参数自定义名称      分页参数     分页参数自定义名称
		public JsonResult getUserList2(@RequestParam Map<String, Object> params, Pager pager){
			//日志打印
			log.info("传入参数--->>>params:"+params);
			//实例化一个 JsonResult 格式的的参数名字叫做 jsonResult
			JsonResult jsonResult = new JsonResult();
			//调用service--调用另外一个盒子
			//实例化一个 参数类型为 List<Map<String, Object>> 的参数 名字为userList
			List<Map<String, Object>> userList=new ArrayList<Map<String, Object>>();
			//接数据 调用另一个盒子 的返回的数据
			userList=u.getUserList2(params);
			jsonResult.put(userList);
			return jsonResult;
		}
		
		//小欣欣的接口
	   @RequestMapping(value = "/list3",method=RequestMethod.GET)// 这个是spring框架的必要索引
		//		返回参数格式           自定义方法名                 注解		    前台参数格式       		       参数自定义名称      分页参数     分页参数自定义名称
		public JsonResult getUserList3(@RequestParam Map<String, Object> params, Pager pager){
				//日志打印
				log.info("传入参数--->>>params:"+params);
				//实例化一个 JsonResult 格式的的参数名字叫做 jsonResult
				JsonResult jsonResult = new JsonResult();
				//调用service--调用另外一个盒子
				//实例化一个 参数类型为 List<Map<String, Object>> 的参数 名字为userList
				List<Map<String, Object>> userList=new ArrayList<Map<String, Object>>();
				//接数据 调用另一个盒子 的返回的数据
				userList=u.getUserList3(params);
				jsonResult.put(userList);
				return jsonResult;
				}
	}
