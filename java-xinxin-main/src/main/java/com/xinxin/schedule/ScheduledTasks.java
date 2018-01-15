package com.xinxin.schedule;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ScheduledTasks {
	@Autowired
	MessageSource messageSource;
	/**
	   * 部署环境变量 
	   * 无：本机  
	   * dev:测试环境 
	   * prod:生产环境
	*/
	@Value("${spring.profiles.active}")
	private String activeProfile;
	
	/**
	 * 每10分钟清理一下待支付，并且超过2小时的订单
	 */
	@Scheduled(cron = "1 * 8-20 * * *")
	public void orderCancelUnpaid() throws Exception{
		log.info(">>>> orderCancelUnpaid start <<<<");
		log.info(">>>> orderCancelUnpaid end <<<<");
	}
	
}