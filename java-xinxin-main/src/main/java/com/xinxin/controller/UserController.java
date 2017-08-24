package com.xinxin.controller;

import java.io.Serializable;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xinxin.mybatis.utils.JsonResult;
import com.xinxin.mybatis.utils.Pager;
import com.xinxin.mybatis.utils.Validation;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/usr")
public class UserController implements Serializable{
	//获取打印权限
	private Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	MessageSource messageSource; 
	
    /**
	 * 示例 ：查询用户列表
	 * @author fengfeng
	 * @params  
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/list",method=RequestMethod.GET)
	public JsonResult getUserList(@RequestParam Map<String, Object> params, Pager pager) throws Exception{
		StringBuffer errMsg = new StringBuffer();
		JsonResult jsonResult = new JsonResult();
		// 校验必填参数
		if (!Validation.checkBlank(params, errMsg, messageSource, "uopid", "ebid")) {
			jsonResult.putFailed(errMsg.toString());
			return jsonResult;
		}
		//获取翻页信息
		pager.setPagerNecessary(params, pager);
		//调用service
		return jsonResult;
	}
   
}
