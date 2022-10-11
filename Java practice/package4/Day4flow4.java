package com.package4;

public class Day4flow4 {
	public static void main(String[] args) {
		System.out.println("main begin");
		int i = 20;
		int j = 45;
		switch (i) {
		case 34:
			//case expressions must be constant expressions case i and case j wont work,1+1 not allowed,char and string allowed
			System.out.println("case1");
			System.out.println("case1 line 2");
			break;
		case 2:
			System.out.println("case 2");
			System.out.println("cas2 line 2");
			break;
		case 20:
			System.out.println("case20");
			System.out.println("case20 line 2");
			break;
		case 30:
			System.out.println("case 30");
			System.out.println("cas2 line 30");
			break;
		default:
			System.out.println("case default");
			System.out.println("case default executes when no other cases match");

		}
		System.out.println("main end " + i);
	}

}
