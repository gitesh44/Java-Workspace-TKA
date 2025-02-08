package Method_Override;

public class Employee {
	public void work() {
		System.out.println("the work is-->");
		
	}
	
	public double getSalary() {
		return 5000;
		
	}

}

class HRmanager extends Employee{
	public void work() {
		System.out.println("HR is not good !");
		
	}
	public void addEmployee() {
		System.out.println("New Employee!");
		
	}
}
