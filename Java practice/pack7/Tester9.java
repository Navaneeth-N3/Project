package com.pack7;
class A9
{
	public  final void test()
	{
	}
}
class B9 //extends A9
{
	public  final void test()
	{
	}
}
public class Tester9 
{
	public static void main(String[] args) 
	{
		System.out.println("main");
	}
}


/*Multiple markers at this line
- Cannot override the final method 
from A9
- overrides com.pack7.A9.test */