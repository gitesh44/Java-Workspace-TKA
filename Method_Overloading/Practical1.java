package Method_Overloading;

public class Practical1 {
	
	
	Practical1(){
		method1("Gitesh");
		method1(96233);
		
		method2("Hi","Cricket",15);
		method2(353326,157,5000);
		
		method3(23,2300.3,6.2f);
		method3(3.2f,5600,5.6f);
		
		 method4(56);
		 method4("Hello JI");
		 
		 method5(55,23.56,5.6f);
		 method5(6.2f,5000,53.4f);
		 
		 method6(55,23.56,5.6f);
		 method6(6.2f,5000,53.4f);
		 
		 Boolean b1=method7(true);
		 System.out.println(b1);
		 
		 int i1=method7(56);
		 System.out.println(i1);
		 
		 method8("Hi world","Hobby",15);
		method8(353326,157,5000);
		
		method9(963,33,523.00);
		method9("GItesh","Gym",96);
		
		method10(52,63);
		method10("Gitesh","Suyash","Jitesh");
		
		method11((int)52.6,63);
		
		 
		 
		 
		
		
		
		
		
	}
	//Program to Demonstrate Method Overloading!
	
	public void method1(String name) {
		System.out.println(name);
		
	}
	public void method1(int Mob) {
		System.out.println(Mob);
	}
	
	//Different Number of Parameters

	public void method2(String name,String hobby,int age) {
		System.out.println();
		System.out.println("Different Number of Parameters");
		
		System.out.println(name);
		System.out.println(hobby);
		System.out.println(age);
		
	}
	public void method2(int Mob,int height,double salary) {
		System.out.println(Mob);
		System.out.println(height);
		System.out.println(salary);
	}
	
	//Method Overloading with Two methods having different data types
	//and common parameter
	
	public void method3(int age,double salary,float height) {
		System.err.println();
		System.out.println();
		System.out.println("Method Overloading with Two methods having different data types");
		System.out.println(age+" "+salary+" "+ height+" ");
		
	}
	public void method3(float age,int salary,float height) {
		System.out.println(age+" "+salary+" "+ height+" ");
		
	}
	
	//Method overloading with Varargs
	
	public void method4(int...age) {
		System.out.println();
		
		System.out.println("Method overloading with Varargs");
		for(int i=0;i<age.length;i++) {
			System.out.println(age[i]);
		}
		
	}
	public void method4(String...name) {
		System.out.println("The varargs");
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		
	}
	
	//Method Overloading for different order of Parameter
	
	public void method5(int age,double salary,float height) {
		System.out.println();
		System.out.println("Method Overloading for different order of Parameter");
		
		System.out.println(age+" "+salary+" "+ height+" ");
		
	}
	public void method5(float height,int salary,float age) {
		System.out.println(height+" "+salary+" "+ age+" ");
		
	}
	
	//Method OverLoading with different access Specifier
	
	public void method6(int age,double salary,float height) {
		System.out.println();
		System.out.println("The Method OverLoading with different access Specifier");
		System.out.println(age+" "+salary+" "+ height+" ");
		
	}
	private void method6(float height,int salary,float age) {
		System.out.println(height+" "+salary+" "+ age+" ");
		
	}
	
	//method Overloading With Different return type
	
	public Boolean method7(boolean age) {
		System.out.println();
		System.out.println("method Overloading With Different return type");
		return age;
		
	}
	public int method7(int salary) {
		return salary;
		
	}
	//Mixture of datatypes and parameters counts
	
	public void method8(String name,String hobby,int age) {
		System.out.println();
		System.out.println("Mixture of datatypes and parameters counts-->");
		
		System.out.println(name);
		System.out.println(hobby);
		System.out.println(age);
		
	}
	public void method8(int Mob,int height,double salary) {
		System.out.println(Mob);
		System.out.println(height);
		System.out.println(salary);
	}
	
	//with changing the number of parameters and Datatypes
	
	public void method9(int Mob,int height,double salary) {
		System.out.println();
		System.out.println();
		System.out.println("with changing the number of parameters and Datatypes");
		System.out.println(Mob);
		System.out.println(height);
		System.out.println(salary);
	
	}
	public void method9(String name,String hobby,int age) {
		System.out.println(name);
		System.out.println(hobby);
		System.out.println(age);
	}
	
	//with different datatypes,vargs and changing the parameters
	
	public void method10(int...age) {
		System.out.println();
		System.out.println("different datatypes,vargs and changing the parameters");
		
		for(int i=0;i<age.length;i++) {
			System.out.println(age[i]);
		}
		
	}
	public void method10(String...name) {
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		
	}
	
	
	//Demonstrate method Overloading with different ambiguity
	//resolution using casting
	
	public void method11(int a,double b) {
		System.out.println();
		System.out.println("Demonstrate method Overloading with different ambiguity resolution using casting");
		System.out.println(a+" "+b+" ");
	}
	
	
	
	
	
	
	
	
	
	
}
