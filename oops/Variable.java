package oops;

public class Variable {
	final int y=100;//Instance -->Final--> Primitive variable //Declared inside a class but outside any method or block.
	static String s="Mango";//Static--->reference //Declared with the static keyword inside a class.
	double dd=11.9;//Instance ---> Declared inside a class but outside any method or block.
	static boolean b1=false;//Static --->Declared with the static keyword inside a class.
	Variable v1=new Variable();//Instance --->Declared inside a class but outside any method or block.
	public char[] a;
	final static Variable v2=new Variable();//Static -->Declared with the static keyword inside a class.
	
	
	public void kk() {
		long h=100; //local--->Primitive variable //Declared inside a method, constructor, or block.
		final char ch='T'; //local -->Declared inside a method, constructor, or block.
		final Variable v2= new Variable(); //Instance -->Declared inside a class but outside any method or block..
		String s="Oranage";//local -->Declared inside a method, constructor, or block.
	}
	

	
	

}





//TODO Auto-generated method stub

		/*
		 * 
		 -------------------------Functions of Compiler---> 
		 - Check syntax error
		 - Convert source code into byte code
		 -Add additional code in byte code.(only if required)
		 
		 
		 ------------------------------JVM------------->
		 -java uses compiler and interpreter both.These both are platform dependent.
		 -COnvert byte code into native code
		 -execute native code step by step.
		 -Compiler Gives default value not JVM!
		 
		 
		 Types of variable
		 --dataType
		 1)primitive variable
		    int d=100;
		    
		 2)reference variable
		     A a1=new A();		 
		 
		 
		 */