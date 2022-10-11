package com.pack7;
public class Tester8 
{
	final static int i=10;// initailization mandatory at global level
	
	public static void main(String[] args) 
	{
		//i = 20;// The final field Tester8.i cannot be assigned
		//i = 20;
		final int j;
		j = 30;
		//j=50;//The final local variable j may already have been assigned
		System.out.println(" i "+ i);
		System.out.println(" j "+ j);
	}
}
