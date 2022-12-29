package Assignment29Dec2022;

import java.util.Scanner;

public class ThreadOdd {

	public static void main(String[] args) {
		MyThread m=new MyThread();

	 }
	}
class MyThread extends ThreadOdd
{
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		 if(num%2==0)
		 {
			 System.out.println("Number Is Even");
		 }
		 else
		 {
			 System.out.println("Number is Odd");
		 }
	}
}
