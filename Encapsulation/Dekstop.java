package Encapsulation;

import java.util.Scanner;
public class Dekstop {
	String name;
	String Processor;
	int RAM;
	int TRAM;
	String ANS;
	
	
	Scanner sc=new Scanner(System.in);
	public Dekstop() {
		acceptValue();
		display();
		//upgrade();
	}
	
	public void setname(String s) {
		name=s;
	}
	
	public String getname() {
		return name;
	}
	
	public void setProcessor(String p) {
		Processor=p;
	}
	
	public String getProcessor() {
		return Processor;
	}
	
	public void setRAM(int r) {
		RAM=r;
	}
	
	public int getRAM() {
		return RAM;
	}
	
	
	
	
	public void acceptValue() {
		System.out.println("enter the Name of your model");
		setname(sc.nextLine());
		System.out.println("enter your Processor");
		setProcessor(sc.next());
		System.out.println("enter RAM");
		setRAM(sc.nextInt());
	}
	
	public void display() {
		System.out.println("your model name is" + getname());
		System.out.println("your Processor is " + getProcessor());
		System.out.println("your RAM is " + getRAM());
		System.out.println("Do you want to upgrade the RAM?");
		ANS=sc.next();
		
		upgrade();
		
	}
	
		
	public void upgrade() {
		if(ANS.equals("yes") ||ANS.equals("Yes") ||ANS.equals("YES")) {
			System.out.println("how much RAM you want to increase?");
			TRAM=sc.nextInt()+ getRAM();
			System.out.println("Your upgraded RAM is " + TRAM );
		}	
			
			else {
				System.out.println();
			}
	
	
	}
}
