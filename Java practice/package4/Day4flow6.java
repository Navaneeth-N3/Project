package com.package4;

public class Day4flow6 {
	public static void main(String[] args) {
		System.out.println("main begin");
		String i = "hello";
		switch (i) {
		case "A":
			//case expressions must be constant expressions case i and case j wont work,1+1 not allowed,char and string allowed
			System.out.println("case1");
			System.out.println("case1 line 2");
			break;
		case "B":
			System.out.println("case 2");
			System.out.println("cas2 line 2");
			break;
		case "C":
			System.out.println("case20");
			System.out.println("case20 line 2");
			break;
		case "Hello":
			System.out.println("Hello");
			System.out.println("Hello ");
			break;
		case "hello":
			System.out.println("hello");
			System.out.println("hello");
			break;
			
		default:
			System.out.println("case default");
			System.out.println("case default executes when no other cases match");

		}
		System.out.println("main end " + i);
	}

}
