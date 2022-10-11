package com.pack7;
class A// super class
{
	static int i;
	static void test()
	{
		System.out.println("from test() of A");
	}
	
}
class B extends A // sub class
{
	
}
public class Tester 
{
	public static void main(String[] args) 
	{
		System.out.println("main");
		System.out.println("A.i "+ A.i);
		A.test();
		System.out.println("=====");
		System.out.println("B.i "+ B.i);
		B.test();
		System.out.println("main");
	}
}
