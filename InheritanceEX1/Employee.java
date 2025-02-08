package InheritanceEX1;

import java.util.Scanner;

public class Employee extends Person2{
	private int EmpID;
	private String position;
	private double salary,gross_salary;
	private double da;
	private double hra,tra;
	private double pt,pf,net_salary;
	

    public Employee(){
    	accept();
		System.out.println();
		Display();
		
    		
    }

	
	Scanner sc=new Scanner(System.in);
	
	public void accept() {
		acceptMethod();
		System.out.println("enter your Salary--> ");
		salary=sc.nextDouble();
	}
	
	public void Display() {
		showMethod();
		System.out.println("da--> "+da());
		System.out.println("hra--> "+hra());
		System.out.println("tra--> "+tra());
		System.out.println("gross--> "+gross());
		System.out.println("pt--> "+pt());
		System.out.println("pf--> "+pf());
		System.out.println("netSalary--> "+netSalary());
		
		
	}
	
	public Double da() {
		da=(8.0/100) * salary;
		return da;
		
	}
	public Double hra() {
		da=(15.0/100) * salary;
		return hra;
	}
	public Double tra() {
		da=(5.0/100) * salary;
		return tra;
		
	}
	public Double gross() {
		 gross_salary=salary+da+hra+tra;
		 return gross_salary;
	}
	public Double pt() {
		pt=(10.0/100) * salary;
		return pt;
	}
	public Double pf() {
		pf=(12.0/100) * salary;
		return pf;
	}
	
	public Double netSalary() {
		 net_salary=gross_salary-(pt+pf);
		 return net_salary;
	}
}
	
	
