package com.xinxin.evryday;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class class20170907 {
		
		public static void main(String[] args) {
			
			String x="2";
			int a=Integer.parseInt(x);
			System.out.println(a);
			String string2="1233";//简写
			String string=new String();
//			--------------------------------------------------
//			今天讲Map和list
			//Map 是按二叉树分发 存放数据
//			map是一个key，Value 形式的储存数据的一个格式
			Map<String, String> thismap = new HashMap<String,String>();
			
			thismap.put("a", 1+"");
			thismap.put("b", "bbb");
			thismap.put("c", "ccc");
			System.out.println(thismap);
			//key 值用string 类型来放  值用object 
			//固定声明格式
			//参数格式      +  自定义名字（不能重复）=new  HashMap<String,Object>();
			Map<String, Object> guoxin =  new HashMap<String,Object>();
			//存数据 put
			guoxin.put("a", "aa");//string /string
			guoxin.put("b", 1);// string / int 
			guoxin.put("c", 1.22);
			guoxin.put("d", thismap);
			//取数据
			//参数一律为定义的  （逗号） 后面定义  参数的格式
			guoxin.get("a");
			guoxin.get("b"); 
			System.out.println(guoxin.get("a"));
			
			String username="11111";
			String password="123456";
			Map<String, Object> usrparams=new HashMap<String,Object>();
			usrparams.put("user", username);
			usrparams.put("pass", password);
			//连接数据储存
			
			Object l=2.222;
			int k=(int)(double)l;
			System.out.println(k);
			
			Map<String, Object> xiaoxin=new HashMap<String,Object>();
	        xiaoxin.put("1111", "44444444");
	        xiaoxin.put("2222", "5555555555");
	        xiaoxin.get("1111");
	        String string3=xiaoxin.get("1111")+"";
	        System.out.println(xiaoxin.get("1111"));
	        System.out.println(string3);
	        
	        
	        //---------------------------------------------------------------------------
	        //list集合讲解
	        //按顺序存取数据
	        //声明格式
	        List<String> aaa=new ArrayList<String>();
	        aaa.add("asd");//第一个
	        
	        List<Integer> vvv=new ArrayList<Integer>();
	        vvv.add(2);
	        
	        List<Map<String, Object>> ccc=new ArrayList<Map<String, Object>>();
	        
	        Map<String, Object> map1=new HashMap<String, Object>();
	        map1.put("map11", "map11value");
	        map1.put("map12", "map11value2");
	        map1.put("map13", "map11value3");
	        
	        Map<String, Object> map2=new HashMap<String, Object>();
	        map2.put("map21", "map11value");
	        map2.put("map22", "map11value2");
	        map2.put("map23", "map11value3");
	        
	        Map<String, Object> map3=new HashMap<String, Object>();
	        map3.put("map31", "map11value");
	        map3.put("map32", "map11value2");
	        map3.put("map33", "map11value3");
	        
	        ccc.add(map1);
	        ccc.add(map2);
	        ccc.add(map3);
	        
	        System.out.println(ccc);
	        ccc.get(0);
	        System.out.println(ccc.get(0));
	        System.out.println(ccc.get(0).get("map12"));
	        
	        class20170907 b=new class20170907();
            String z=b.xiaoxin();
            System.out.println(z);
            
	        
		}
		public String xiaoxin() {
	        return "987654321";
	        }
}
            
            