package oops;

public class Variable2 {
	static int a; //Instance variable
	String str; //Instance variable
	
	 void display() {
		 a=90; //local variable
		 str="hei"; //local variable
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable2 v1=new Variable2();
		v1.display();
		System.out.println(v1.a);
		System.out.println(v1.str);
		System.out.println(Variable2.a); //no need to create an object for static variable.
		
	}

}
