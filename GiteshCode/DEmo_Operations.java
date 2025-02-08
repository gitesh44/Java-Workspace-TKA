package GiteshCode;
import java.util.Scanner;


public class DEmo_Operations {
	
	public int a;
	public int b;
	int sum,sub,mul,div,mod;
	
	DEmo_Operations(){
		
		
	}
	
	Scanner sc=new Scanner(System.in);
	public void accept() {
		System.out.println("Enter the value of a--->> ");
		a=sc.nextInt();
		
		System.out.println("Enter the value of b--->> ");
		b=sc.nextInt();
	}
	
	
	public void display1() {
		System.out.println("the operations are--> ");
		Addition();
		Substraction();
		Multiplication();
		Division();
		Mod();
	
		
		
		
		
	}
	public void Addition() {
		sum=a+b;
		System.out.println("Sum-->"+sum);
	}
	
	public void Substraction() {
		//int sub;
		sub=a-b;
		System.out.println("Sub-->"+sub);
	}
	public void Multiplication() {
		//int mul;
		mul=a*b;
		System.out.println("mul-->"+mul);
	}
	public void Division() {
		//int div;
	    div=a+b;
		System.out.println("division---> "+ div);
	}
	public void Mod() {
		//int mod;
	    mod=a%b;
		System.out.println("mod---> "+ mod);
	}


	
	

}
