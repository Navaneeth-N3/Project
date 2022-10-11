package com.pack2;

import com.pack1.A;

class F extends A{
	
	public static void main(String[] args) {
		
		F rv = new F();
		System.out.println(rv.k);
		rv.test3();
		
		/*A rv1 = new A();//supetclass not allowed
		System.out.println(rv1.k);
		rv1.test3();*/
		//E rv1 =new E();
		//rv1.test3();		
		
	}

}
