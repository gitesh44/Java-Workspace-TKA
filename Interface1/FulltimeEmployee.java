package Interface1;

class FulltimeEmployee implements Employee{
	
	private double salary;
	private int Empid;
	private String name;
	private String Company;
	

	public FulltimeEmployee( String name,int Empid,String Company,double salary) {
		this.name=name;
		System.out.println("The name is--> "+name);
		
		this.Empid=Empid;
		System.out.println("Company's Empid is --> "+Empid);
		
		this.Company=Company;
		System.out.println("HoursWorked --> "+Company);
		
		this.salary=salary;
		System.out.println("The salary is--> "+salary);
	}
	
	
	
	@Override
	public double calculateSalary(double salary) {
		
		System.out.println("The salary is"+salary);
		return salary;
	}

	@Override
	public void getEmployeeDetails() {
		
		
	}
	
}