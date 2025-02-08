package Array2;

import java.util.Scanner;

public class Employee {
	private String name, department;
	private long phoneNo;
	private double salary;
	
	
	public static void acceptData(Employee arr[]) {
		for(int i=0;i<arr.length;i++) {
			arr[i] = new Employee();
			arr[i].setData();
		}
	}
	
	public static void ShowData(Employee arr[]) {
		for(int i=0;i<arr.length;i++) {
			arr[i].getData();
		}
	}
	
	
	public static void sortSalary(Employee ee[]) {
		for(int i=0;i<ee.length;i++) {
			for(int j=i+1;j<ee.length;j++) {
				if(ee[i].salary>ee[j].salary) {
					Employee e = ee[i];
					ee[i] = ee[j];
					ee[j] = e;
				}
			}
		}
		
	}
	
	public void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		name = sc.next();
		System.out.println("Enter the Phone no: ");
		phoneNo = sc.nextLong();
		System.out.println("Enter the Department: ");
		department = sc.next();
		System.out.println("Enter the salary: ");
		salary = sc.nextInt();
		}
	
	public void getData() {
		System.out.println("----------Details-----------");
		System.out.println("Name: " + name);
		System.out.println("Phone No: " + phoneNo);
		System.out.println("Department: " + department);
		System.out.println("Salary: "+ salary);
	}
}