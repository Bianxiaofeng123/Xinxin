package com.xinxin.evryday;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import lombok.extern.slf4j.Slf4j;

public class class20170823 {
	public static void main(String[] args) {
//		class20170823 class20170823=new class20170823();
//		class20170823.name();
//		int i=5000/300;
//		System.out.println(i);
		Map<String, Object> OrderMap=new HashMap<>();
		OrderMap.put("status1", "2");
		if (!("3".equals(OrderMap.get("status1").toString()) || "2".equals(OrderMap.get("status1").toString()))) {
			throw new IllegalAccessError("订单支付超时，请重新下单");
		}
		System.out.println("ok");
	}
	
	public void name() {
//		Map<String, Object> params=new HashMap<String, Object>();
//		System.out.println(this.getClass().getSimpleName());
//		params.put("insfnc", this.getClass().getName()+"."+Thread.currentThread().getStackTrace()[1].getMethodName());
//		System.out.println(params);
//		if (params.get("insfnc")!=null) {
//			String insfncstr=params.get("insfnc").toString();
//			System.out.println(insfncstr);
//			String [] fnclist=insfncstr.split("\\.");
//			System.out.println("---->>>>insfnc:"+fnclist);
//			if (fnclist.length>2) {
//				params.put("insfnc", fnclist[fnclist.length-2]+"."+fnclist[fnclist.length-1]);
//			}else {
//				params.put("insfnc", fnclist[0]+"."+fnclist[1]);
//			}
//		}
//		UUID xuruid = UUID.randomUUID();
//		String string=xuruid.toString().replaceAll("-", "");
//		System.out.println("params:"+string);
//		String string2="2";
//		if (string2.indexOf("加")==-1) {
//			System.out.println("不包含");
//		}
		Map<String, Object> map=new HashMap<String,Object>(){{
			put("tpoint", 0);
			put("tlevel", 0);
		}};
		System.out.println(map);
	}
}

