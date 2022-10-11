package com.pack7;
class A5_a
{
	A5_a(int i)
	{
		System.out.println("from A(int)");
	}
	A5_a()
	{
		this(90);
		System.out.println("from A()");
	}
}
class B5_a extends A5_a
{
	B5_a()
	{
		//super(30);
		//super(); // by default compiler provides super statement with no arguments
		System.out.println("from B()");
	}
}
public class Tester5_a 
{
	public static void main(String[] args) 
	{
		B5_a b1 = new B5_a();
	}
}
