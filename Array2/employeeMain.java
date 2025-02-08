package Array2;

public class employeeMain {
	public static void main(String[] args) {
		
		Employee[] ee = new Employee[3];
		Employee.acceptData(ee);
		Employee.ShowData(ee);
		Employee.sortSalary(ee);
		Employee.ShowData(ee);
	}
}