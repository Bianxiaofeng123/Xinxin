package com.xinxin.evryday;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.IntBinaryOperator;
import java.net.Inet4Address;
import java.text.*;

import org.apache.poi.util.SystemOutLogger;
import org.assertj.core.api.IntArrayAssert;
import org.eclipse.jetty.websocket.server.WebSocketHandler.Simple;

import com.jayway.jsonpath.EvaluationListener.FoundResult;

public class xin2017928 {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date.toString());

		// 获取当前日期和时间

		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat(" yyyy.MM.dd E 'at' hh:mm:ss a zzz");

		System.out.println(ft.format(dNow));
		// 设置日期格式

		int sum = 0;
		int i = 0;
		for (i = 0; i <= 100; i++) {
			sum = sum + i;

		}
		System.out.println(sum);
		
		
	    int a = Integer.MAX_VALUE;
	    int b = Integer.MAX_VALUE;
	    int summ = a+b;
	    System.out.println("a="+a+",b="+b+",sum="+summ);
	    
	    
	    

	}

}
