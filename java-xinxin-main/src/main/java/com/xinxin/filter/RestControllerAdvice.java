package com.xinxin.filter;

import java.io.IOException;
import java.nio.file.AccessDeniedException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.xinxin.mybatis.utils.JsonResult;



@ControllerAdvice(annotations = RestController.class)
public class RestControllerAdvice {
	
    @ResponseBody
    @ExceptionHandler(AccessDeniedException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    JsonResult accessDeniedExceptionHandler(HttpServletResponse response, AccessDeniedException ex) 
    		throws IOException {
    	JsonResult r =  new JsonResult();
    	r.putFailed("访问没有权限:" + ex.getMessage());
		return r;
    }
    
    @ResponseBody
    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    JsonResult badRequestExceptionHandler(HttpServletResponse response, IllegalArgumentException ex) 
    		throws IOException {
    	JsonResult r =  new JsonResult();
    	r.putFailed("错误: " + ex.getMessage());
		return r;
    }
     
    @ResponseBody
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    JsonResult exceptionHandler(HttpServletResponse response, Exception ex) throws IOException {
    	JsonResult r =  new JsonResult();
    	r.putFailed("服务器无法完成您的请求:" + ex.getMessage());
		return r;
    }

}
