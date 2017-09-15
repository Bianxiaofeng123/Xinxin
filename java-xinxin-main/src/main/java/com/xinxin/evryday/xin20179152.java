package com.xinxin.evryday;

public class xin20179152 {
	public static void main(String[] args) {
		char grade = 'd';
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
		System.out.println("你的等级是"+grade);
	}

}
