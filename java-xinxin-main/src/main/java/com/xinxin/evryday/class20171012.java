package com.xinxin.evryday;

public class class20171012 {
	
	public static void main(String[] args) {
		String string="A.东;B.南;C.西;D.北";
		//要拆分放进数据库4个字段：bxca,bxcb,bxcc,bxcd
		String[] strlist=string.split(";");
		for (String string2 : strlist) {
			System.out.println(string2);
		}
	}
}
