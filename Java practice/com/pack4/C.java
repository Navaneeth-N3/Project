package com.pack4;

import java.util.Scanner;
//taking user input
public class C {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your name");
		String name = sc.next();//calling next method
		System.out.println("hello "+ name);
		System.out.println("please enter a number");
		int i = sc.nextInt();
		if(i%2 == 0 )
		{
			System.out.println("entered number is "+ i+" is EVEN");
		}
		else
		{
			System.out.println("entered number is "+ i+" is ODD");
		}
	}

}
