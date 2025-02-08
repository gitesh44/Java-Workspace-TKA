package Interface1;

public class PartimeEmployee implements Employee {
	private String name;
	private int Empid;
	private int CompanyhrRate;
	private int HoursWorked;
	
	public PartimeEmployee( String name,int CompanyhrRate, int HoursWorked) {
		this.name=name;
		System.out.println("The name is--> "+name);
		
		this.CompanyhrRate=CompanyhrRate;
		System.out.println("Company's Rate per Hour--> "+CompanyhrRate);
		
		this.HoursWorked=HoursWorked;
		System.out.println("HoursWorked --> "+HoursWorked);
	}
	
	
	
	@Override
	public double calculateSalary(double salary) {
		int parttimeSalary= CompanyhrRate*HoursWorked;
		System.out.println("the Salary is" + parttimeSalary);
		
		return parttimeSalary;
	}
	
	public void getEmployeeDetails() {
		
		
	}


}
