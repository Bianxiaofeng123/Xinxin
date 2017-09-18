package com.xinxin.evryday;

public class xin20179152 {
	public static void main(String[] args) {
		char grade = 'b';
		switch (grade) {

		case 'a':
			System.out.println("优秀");
			break;
		case 'b':
		case 'c':
			System.out.println("良好");
			break;
		case 'd':
			System.out.println("你需要再努力努力");
			break;

		default:
			System.out.println("未知等级");
			break;

		}
		System.out.println("你的等级是" + grade);

		String bString = "b";
		String cString = "a";
		int i = 11;
		int ix = 2;
		int ixx = 11;
		if (i != ix && i == ixx) {
		}
		if (i != ix || i == ixx) {
			System.out.println("yiyang");
		}
		if (!bString.equals(cString)) {
			System.out.println("字符串不一致");
		} else {
			System.out.println("字符串一致");
		}
		
		
	}

}
