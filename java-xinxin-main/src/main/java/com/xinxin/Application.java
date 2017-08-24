package com.xinxin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xinxin.Application;

@SpringBootApplication
@Configuration
//@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.xinxin" }) //此处添加的不同的包名（即根包名）的时候，添加相应的根包名即可。
@Controller
//@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 60)
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		log.debug("com.xinxin项目启动");
		SpringApplication.run(Application.class, args);
	}
}
