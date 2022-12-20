package com.jsp.kartik;
class SpecialNo{
	public static void main(String[]args) {
		int num=109;
		int a=num%10;
		int b=num/10;
		if((a*b)+(a+b)==num) {
			System.out.println("Special no"+num);
		}else {
			System.out.println("NotSpecail no"+num);
		}
		
	}
}