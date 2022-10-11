package com.package4;

public class Day4flow3 {
	public static void main(String[] args) {
		System.out.println("main begin");
		int i = 10;
		System.out.println(i);
		if(i++ == 10)//(10==10) true
		{
			System.out.println("if block " + i);//+i=11
		}
		else if(i++ == 11)
		{
			System.out.println("else if  block " + i);
		}
		else
		{
			System.out.println("else block " + i);
		}
		System.out.println("main end " + i);
	}

}
