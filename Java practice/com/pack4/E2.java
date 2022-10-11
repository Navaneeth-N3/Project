package com.pack4;

import java.util.Arrays;

public class E2 {
	
	// Enhanced for loop
	public static void main(String[] args) {
		System.out.println("main ");
		int[] iArr = {4, 5, 6,7, 8 };
		
		System.out.println(iArr.length);
		
		for(int i : iArr)
		{
			System.out.println(i);
			
		}
		System.out.println(Arrays.toString(iArr));
		
	}

}
