package com.pack3;

import java.util.Arrays;

public class A 	//extends Object{//object is a superclass
{						//default compiler will have object
	
	int i;
	@Override
		public String toString() {
			return "i="+i;
			
		}
	
	

	public static void main(String[] args) {
	

		A rv = new A();
		
		rv.i =10;
		System.out.println(rv.toString());
		System.out.println(rv);
		System.out.println(rv.hashCode());
		System.out.println("==========");
		A rv1 = rv;
		System.out.println(rv1);
		System.out.println(rv1.hashCode());
		System.out.println("=========");
		A rv2 = new A();
		rv2.i = 10;
		System.out.println(rv2);
		System.out.println(rv2.hashCode());
		System.out.println("=============");
		System.out.println(rv.equals(rv1));
		System.out.println(rv.equals(rv2));
		//Object rv6 = new Object();//nonstatic method
		//A oject is a data type A[] arr= {rv,rv1,rv2};
		//System.out.println(Arrays.toString(arr));
	}
	
	
	


}
