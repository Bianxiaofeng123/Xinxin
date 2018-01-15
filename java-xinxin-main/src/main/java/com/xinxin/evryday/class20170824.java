package com.xinxin.evryday;

public class class20170824 {
	public static void main(String[] args) {
		String string=
				"3.根据患者病情、体重、意识和肢体活动能力，选择运送工具（轮椅/平车）；\n" + 
				"4.检查轮椅或平车的性能是否良好，使用平车时，要在护士的指导下，准备铺垫、枕头、带套的毛毯和棉被等用物；\n" + 
				"5.协助护士共同搬运病人至平车或轮椅。\n" + 
				"6.整理床单元；\n" + 
				"7.推送或陪伴患者至目的地。";
		System.out.println(string);
		String string2 = string.replaceAll("(\r\n|\r|\n|\n\r)", "<br>");  
		System.out.println(string2);
	}
}
