package com.pack3;

public class Day3datatype15 {

	public static void main(String[] args) {
		int i=32;
		int j=i++ + i;
		//  32+33
		
		System.out.println("After assignment j="+j);// prints 33+32=65
		System.out.println("After increment value of i"+i);// prints 33
		/*Post increment/Decrement does 2 things
		1. use the uncahnged value
		2.Increase/Decrease value by 1
		*/
		int k=i-- + i;// 
		//32+33
		System.out.println("After assignment k="+k);// prints 65
		System.out.println("After increment value of i"+i);// prints 32
		
		
		
	}

}
