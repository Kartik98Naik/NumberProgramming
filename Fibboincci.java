package com.jsp.kartik;
class Fibbonacci{
	public static void main(String[]args) {
		for(int i=1;1<=10;i++) {
		System.out.println(fibbo(i));
		}
	}
	public static int fibbo(int n) {
		if(n==1) {
			return 0;
		}
		if(n==2) {
			return 1;
		}
		return fibbo(n-1)+fibbo(n-2);
	}
}