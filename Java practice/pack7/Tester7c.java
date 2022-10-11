package com.pack7;
class A7c
{
	void test()
	{
		System.out.println("test() of super class A");
	}

}
class B7c extends A7c
{
	void test()
	{
		System.out.println("test() of sub class B");
	}

	void test(int a)
	{
		System.out.println("test(int) of sub class B");
	}
	
}

public class Tester7c
{
	public static void main(String[] args)
	{
		System.out.println("main starts");
		B7c rv = new B7c();
		rv.test();
		rv.test(90);
		System.out.println("main ends");
	}
}