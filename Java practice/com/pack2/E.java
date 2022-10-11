package com.pack2;

import com.pack1.A;
//import com.pack1.C;

//import concept -- public and default class
//other access level for class not possible
//deauly memebers we can only access iside the package we have developed
//even default methods
//protected also within package
//outside package with inheritance(protect)
public class E extends A{
	
	public static void main(String[] args) {
		System.out.println("main begin");
		E rv = new E();
		//System.out.println(rv.i);
	    //System.out.println(rv.j);
		System.out.println(rv.k);
		System.out.println(rv.l);
		System.out.println("========");
		//rv.test1();
		//rv.test2();
		rv.test3();
		rv.test4();
		
		
		
		
		
	
	}

}
