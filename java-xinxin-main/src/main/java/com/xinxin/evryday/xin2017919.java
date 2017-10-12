package com.xinxin.evryday;

import javax.websocket.Decoder.Text;

import com.alibaba.druid.sql.visitor.functions.Length;

import junit.framework.Test;

public class xin2017919 {
	public static void main(String[] args) {
		System.out.println("访问\"小欣欣\"");
//条件运算符
		int a, b;
		a = 10;
		// 如果a等于1成立，则设置b为20；否则为30.
		b = (a == 1) ? 20 : 30;
		System.out.println("Value of b is : "+b);
		//如果a等于10成立，则设置b为20；否则为30.
		b = (a==10)?20:30;
		System.out.println("Value of b is : "+b);
		
		
		char [] helloarray= {'r','u','n','o','o','b'};
		String hellostring = new String (helloarray);
		System.out.println(hellostring);
		
		
		String site = "www.baidu.com";
		int len = site.length();
		System.out.println("百度的长度是："+len);
		
		
		

	}

}
