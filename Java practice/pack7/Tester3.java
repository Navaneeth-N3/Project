package com.pack7;
class A3
{
	static int i;
	static void test()
	{
		System.out.println("from test() of A");
	}
}
class B3 extends A3
{
	static int j;
	static void test1()
	{
		System.out.println("from test1() of B");
	}

}
public class Tester3
{
	public static void main(String[] args) 
	{
		System.out.println("main");
		A3.i = 10;
		System.out.println("A3.i "+ A3.i);
		A3.test();
		System.out.println("=====");
		//A3.j = 20; cannot access sub class member using super class name
		System.out.println("B3.i "+ B3.i);
		System.out.println("B3.j "+ B3.j);
		B3.test();
		B3.test1();
		System.out.println("main");
	}
}
