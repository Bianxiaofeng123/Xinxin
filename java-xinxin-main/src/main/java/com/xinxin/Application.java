package com.xinxin;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Configuration
// @EnableAutoConfiguration
// 自动扫描根包名为com.eht.y1da的包。
@ComponentScan(basePackages = { "java.xinxin.main" }) // 此处添加的不同的包名（即根包名不是com.eht.y1da）的时候，添加相应的根包名即可。
@Controller
// @EnableRedisHttpSession(maxInactiveIntervalInSeconds = 60)
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		log.debug("XINXIN项目启动");
		SpringApplication.run(Application.class, args);
	}
	/*@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:messages");
		return messageSource;
	}*/
}
