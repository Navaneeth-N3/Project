package com.pack7;
class A2
{
	 int i;
	 void test()
	{
		System.out.println("from test() of A");
	}
}
class B2 extends A2
{
	int j;
	 void test1()
	{
		System.out.println("from test1() of B");
	}
}
public class Tester2
{
	public static void main(String[] args) 
	{
		System.out.println("main");
		A2 a1 = new A2();
		a1.i = 10;
		//a1.j = 20; //j cannot be resolved or is not a field //using super class ref. variable cannot access sub class method
		System.out.println("a1.i "+ a1.i);
		a1.test();
		System.out.println("=====");
		B2 b1 = new B2();
		b1.i = 20;
		b1.j = 30;
		System.out.println("b1.i "+ b1.i);
		System.out.println("b1.j "+ b1.j);
		b1.test();
		b1.test1();
		System.out.println("main");
	}
}
