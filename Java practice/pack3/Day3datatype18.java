package com.pack3;

public class Day3datatype18 {
	public static void main(String[] args) {
		int i=32;
		int j=++i;// increments i by 1 and then assigns  changed i value to j
		System.out.println("After increment value of i="+i);//prints33
		System.out.println("After assignment j="+j);// prints 33
		
		int k=--i;//decrements i by 1 and then assigns changed i value to k
		System.out.println("After assignment k="+k);// prints 32
		System.out.println("After decrement value of i"+i);//prints 32
		
	}

}
