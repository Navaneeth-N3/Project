package com.pack7;
final class A10
{
}
class C10  //extends A10
{
}
class B10 // extends  A10
{
}
class D10 //extends String
{
	
}
public class Tester10 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		A a1 = new A();
		System.out.println(a1.toString());
	}
}

//The type C10 cannot subclass the final class A10
//The type D10 cannot subclass the final class String