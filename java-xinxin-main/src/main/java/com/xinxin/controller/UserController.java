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
		public JsonResult getUserList(@RequestParam Map<String, Object> params, Pager pager) throws Exception{
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
		
		@RequestMapping(value = "/list2",method=RequestMethod.GET)// 这个是spring框架的必要索引
		public JsonResult getUserList2(@RequestParam Map<String, Object> params, Pager pager) throws Exception{
			//日志打印
			log.info("--->>>params:"+params);
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
		
		/**
		 * 主要是针对参数的校验
		 * 返回格式的处理
		 * 请求方式的定义
		 * @param params
		 * @param pager
		 * @return
		 * @throws Exception
		 */
		@RequestMapping(value = "/list3",method=RequestMethod.GET)// 这个是spring框架的必要索引
		public JsonResult getUserList3(@RequestParam Map<String, Object> params, Pager pager) throws Exception{
			//实例化一个 JsonResult 格式的的参数名字叫做 jsonResult
			JsonResult jsonResult = new JsonResult();
			//日志打印
			log.info("--->>>params:"+params);
			if (params.get("user") == null) {
				log.info("用户名为空");
				return jsonResult;//直接返回数据，不执行以下所有代码
			}
			//调用service--调用另外一个盒子
			//实例化一个 参数类型为 List<Map<String, Object>> 的参数 名字为userList
			List<Map<String, Object>> userList=new ArrayList<Map<String, Object>>();
			//接数据 调用另一个盒子 的返回的数据
			userList=u.getUserList3(params);
			jsonResult.put(userList);
			return jsonResult;
		}
	}
