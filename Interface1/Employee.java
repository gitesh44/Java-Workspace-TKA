package Interface1;
//Create an interface called Employee with two methods: double calculateSalary():
//Returns the salary of the employee.
//String getEmployeeDetails():
//Returns the employee details.
//Now, implement the following employee classes:
//FullTimeEmployee: /
//Has private fields salary and name.
//PartTimeEmployee:
//Has private fields hourlyRate, hoursworked, and mane.
//Both classes should implement the Employee interface, and the method calculateSalary() should compute the salary based on the type of employee.
//Full-time employees receive a fixed salary, and part-time employees are paid based on their hourly rate and hours worked.

public interface Employee {
	
	public double calculateSalary(double salary);
	public void getEmployeeDetails();
	
}


