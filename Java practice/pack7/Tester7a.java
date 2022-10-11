package com.pack7;
class Father
{
	void singer()
	{
		System.out.println("classical Singer");
	}

}
class Son extends Father
{
	
	void singer()
	{
		//super.singer();
		System.out.println("Rockstar Singer");
	}
	
}

class Daughter extends Father
{
	void singer()
	{
		
		System.out.println("Pop Singer");
	}
	
}

public class Tester7a
{
	public static void main(String[] args)
	{
		System.out.println("main starts");
		Son rv = new Son();
		rv.singer();

		Daughter rv1 = new Daughter();
		rv1.singer();
		System.out.println("main ends");
	}
}
