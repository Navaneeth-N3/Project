package com.pack7;
class A5
{
	A5(int i)
	{
		System.out.println("from A(int)");
	}
}
class B5 extends A5
{
	B5()
	{
		super(30);// constructor chaining to be maintained with super 
		//super();
		System.out.println("from B()");
	}
}
public class Tester5 
{
	public static void main(String[] args) 
	{
		B5 b1 = new B5();
	}
}
