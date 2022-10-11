package com.pack7;
class A4
{
	A4()
	{
		System.out.println("from A()");
	}
}
class B4 extends A4 
{
	B4()
	{
		//super();
		System.out.println("from B()");
	}
}
public class Tester4 
{
	public static void main(String[] args) 
	{
		B4 b1 = new B4();
	}
}
