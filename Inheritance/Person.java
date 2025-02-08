package Inheritance;
import java.util.Scanner;



public class Person {
	private String name;
	private int mob;
	private String address;
	
	public Person(){
		Person p1=new Person();
		
		
	}
	
	
	//getter 
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setMob(int mob) {
		this.mob = mob;
		
	}
	
	
	//setter
	
	public String getName() {
		return name;
	}

	public int getMob() {
		return mob;
	}


	public String getAddress() {
		return address;
	}


	
	public void acceptMethod() {
		System.out.println("Enter the name--> ");
		setName(sc.next());
		
		System.out.println("Enter mob--> ");
		setMob(sc.nextInt());
		
		System.out.println("Enter address--> ");
		setAddress(sc.nextLine());
		
		
		
	}
	
	public void showMethod() {
		getName();
		getMob() ;
		getAddress();
		
		
		
	}
	
	Scanner sc=new Scanner(System.in);
	class Student extends Person{
		private String name;
		private String mailid,grade;
		private double marks,percentage;
		private int m1,m2,m3,m4,m5;
		
		Student(){
			
		}
		
		public void accept() {
			System.out.println("Enter the name--> ");
			name=sc.next();
			
			System.out.println("Enter mail id--> ");
			mailid=sc.next();
			
			System.out.println("Enter mailid--> ");
			marks=sc.nextDouble();
			
		}
		
		public void showStudent() {
			System.out.println("the name is "+name);
			System.out.println("Enter mail id--> "+mailid);
			System.out.println("Enter marks--> "+marks);
			
		}
		
		public void totalmarks() {
			
			
			for(int i=0;i<=5;i++) {
				System.out.println("the marks are--->  "+marks);
			}
			
		}
		
		
		public void percentage() {
			double percentage= (marks/100)*500;
			System.out.println("the percentage is--> "+percentage);
		}
		
		public void grade() {
			if(percentage>=85) {
				System.out.println("You got A grade");
				
			}
			else if(percentage>=65) {
				System.out.println("You got B grade");
				
			}
			else if(percentage>=50) {
				System.out.println("You got C grade");
			}
			else if(percentage>=36) {
				System.out.println("You got D grade");
			}
			else {
				System.out.println("You are fail!");
			}
		}

		
	}
}
