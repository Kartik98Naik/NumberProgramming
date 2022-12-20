//wajp to find whether no is Strong number or not?
package com.jsp.kartik;
import java.util.Scanner;
public class StrongNumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter number");
	int b= sc.nextInt();
	int fact=1;
	int j=b;
	int sum=0;
	while(b>0) {
		int num=j%10;
		
	for(int i=num;i>=1;i--) {
		fact= fact*i;
	}
	   sum=sum+fact;
	     j=j/10;
	     b--;
	     
	}
//	if(fact==b) {
//		System.out.println("Strong number :"+j);
//	}else {
//		System.out.println("not strong number :"+j);
//	}
	System.out.println(sum);

}
}
