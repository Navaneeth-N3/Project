package com.pack7;
class A7
{
	void test()
	{
		System.out.println("from test() of A");
	}
}
class B7 extends A7
{
	void test()
	{
		super.test();// for non static super is a ref. variable through which we can access super class non static memebers
		System.out.println("from test() of B");
		//super.test();
		//this.test(); // same test method will be called infinite loop
}
}
public class Tester7
{
	public static void main(String[] args) 
	{
		System.out.println("main");
		B7 b1  = new B7();
		b1.test();
		System.out.println("main");
	}
}
