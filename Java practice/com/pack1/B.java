package com.pack1;

public class B{
	
	public static void main(String[] args) {// through public we can access private members
		A.main(null); //-- indirectly accessing private members through public class
		//direct access of private members not possible
		//Even through inheritance private members are not inherited
		
		/*System.out.println("main begin");
		A rv = new A();
		//System.out.println(rv.i);
		System.out.println(rv.j);
		System.out.println(rv.k);
		System.out.println(rv.l);
		System.out.println("========");
		//rv.test1();
		rv.test2();
		rv.test3();
		rv.test4(); */
	}
	
	//outside class we are not able to access private memebers
	//inside public main mehtod we can access hence we can A.main("String");
	

}
