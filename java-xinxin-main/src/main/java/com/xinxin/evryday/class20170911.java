package com.xinxin.evryday;

import java.util.Map;

public class class20170911 {
	
	
	public static void main(String[] args) {
//		参数格式
		System.out.println("运行main");
		class20170911 c=new class20170911();
		c.aaa1();
		c.aaa2();
	}
	
	public void aaa1() {
		System.out.println("运行1盒子");
		class20170911 c=new class20170911();
		c.aaa2();
	}
	
	public void aaa2() {
		System.out.println("运行2盒子");
	}
}
