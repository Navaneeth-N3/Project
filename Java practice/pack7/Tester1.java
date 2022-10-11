package com.pack7;

class A1
{
	 int i;
	 void test()
	{
		System.out.println("from test() of A");
	}
}
class B1 extends A1
{
}
public class Tester1
{
	public static void main(String[] args) 
	{
		System.out.println("main");
		A1 a1 = new A1();
		a1.i = 10;
		System.out.println("a1.i "+ a1.i);
		a1.test();
		System.out.println("=====");
		B1 b1 = new B1();
		b1.i = 20;
		System.out.println("b1.i "+ b1.i);
		b1.test();
		System.out.println("a1.i "+ a1.i);
		System.out.println("main");
	}
}
