package com.xinxin.evryday;

public class class20170906 {
	//主方法
	public static void main(String[] args) {
		//控制台打印
		System.out.println("打印");
		double a=1.62;
		int b=(int)a; //强制转换
		System.out.println("a："+a+";"+"b："+b+";");
		//当double类型的参数转换为整型参数时，会舍弃小数点后面的所有数据
		//高精度单位转换为低精度单位时，会产生偏差或者数据丢失
		
		String c=a+"";
		String d=b+"";
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		
		int x=3;
		double y=x;
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		//低精度转换为高精度时,如果精度不够会自动补充完精度，一般补充为0
		
		//作业
		double dou=1.22;
		//强制转换为int
		//再转换为double
		//再转换为String
		//输出一下
		
		int dou2=(int)dou;
		double dou3=dou2;
		String dou4=dou3+"";
		System.out.println(dou4);
		
		//string 转换成int 
		String str="5";
		//int 的封装时 Integer 
		int strint= Integer.parseInt(str);
		int strint2=strint+1;
		System.out.println("strint:"+strint2);
		//double 的封装时 Double 
		String str2="1.22";
		double doustr=Double.parseDouble(str2);
		System.out.println("doustr:"+doustr);
		
		//zuoye
		String guo="7";
		int guo1=Integer.parseInt(guo);
		int guo2=guo1+2;
		System.out.println(guo2);
		String xin="7.77";
		double xinxin=Double.parseDouble(xin);
		System.out.println(xinxin);
		
		
		
	}
}
