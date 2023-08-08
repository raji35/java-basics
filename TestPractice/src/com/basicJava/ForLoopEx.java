package com.basicJava;

import java.util.Iterator;
import java.util.Scanner;

 

public class ForLoopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter starting number");
		int num1 = scanner.nextInt();
		System.out.println("Enter ending number");
		int num2= scanner.nextInt();
//		int sum=0;
		 
		for(int i=num1;i>=num2; i--) {
			if(i%2!=0) {
				System.out.println(i);
			}		 
				
		}
		
		 
	}

}
