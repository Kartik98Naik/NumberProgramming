package com.jsp.kartik;
class Code6{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			int k=i;
			for(int j=1;j<=i;j++) {
				System.out.print(k);
				k=k+n-j;
			}
			System.out.println(" ");
		}
	}
}