package com.pack2;

import com.pack1.A;///import statement should be used after package
//import com.pack1.C; we cannot import default class
// we cannot import default package outside the com.pack1

//import concept -- public and default class
//other access level for class not possible
public class E2 extends A{
	
	public static void main(String[] args) {
		System.out.println("main begin");
		A rv = new A();
		//System.out.println(rv.i);
		//System.out.println(rv.j);
		//System.out.println(rv.k);
		System.out.println(rv.l);
		System.out.println("========");
		//rv.test1();
		//rv.test2();
		//rv.test3();
		rv.test4();
		
		
		
		
		
	
	}

}
