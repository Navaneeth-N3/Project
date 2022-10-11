package com.pack3;

public class Day3datatype14{
	public static void main(String[] args) {
		int i=32;
		int j=i++;// assigns unchanged i value to j and then increments i by 1
		System.out.println("After increment value of i"+i);// prints 33 
		System.out.println("After assignment j="+j);
		/*Post increment/Decrement does 2 things
		1. use the unchanged value
		2.Increase/Decrease value by 1
		*/
		int k=i--;// assigns unchanged i value to k and then increments i by 1
		System.out.println("After increment value of i"+i);// prints 32
		System.out.println("After assignment k="+k);//prints 33 because now k has updated value 33 
		
		
	}

}
