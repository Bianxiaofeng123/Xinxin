package com.xinxin.evryday;

//公有的+class固定写法+自定义类名
public class class20170908 {
	
	public static void main(String[] args) {
		//一个java文件一般情况就是一个类  class
		
		//实例化这个类-准备用这个类了
		//类名    自定义名=new 类名（）;
		class20170908 c=new class20170908();
		String s=c.a();
		System.out.println(s);
	}
	
	//公有的+返回参数格式+自定义方法名
	public String a() {
		//return 返回的意思
		class20170908 c=new class20170908();
		String s=c.b();
		System.out.println(s);
		return "a";
	}
	
	//公有的+返回参数格式+自定义方法名
	public String b() {
		//return 返回的意思
		return "b";
	}
	
}
