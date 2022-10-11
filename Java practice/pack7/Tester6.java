package com.pack7;
class A6
{
	void test()
	{
		System.out.println("from test() of A");
	}
}
class B6 extends A6
{
	
	void test()
	{
		
		System.out.println("from test() of B");// 
		
		
	}
}
public class Tester6
{
	public static void main(String[] args) 
	{
		System.out.println("main");
		
		B6 b1  = new B6();
		b1.test();// parent class will be overridden and subclass method will print
		System.out.println("main");
	}
}
