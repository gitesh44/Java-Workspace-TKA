package Array2;

public class EmployeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe arr[]=new Employe[3];
		
		
//		Employe.accept(arr);
//		Employe.show(arr);
		
		Employe.acceptvalue(arr);
		System.out.println();
		System.out.println();
		//Employe.showMethod(arr);
		Employe.Sort(arr);
		System.out.println();
		Employe.showMethod(arr);
		

	}

}
//create a class Employee 
//	- define properties of Employee - name,post,salary
//	- define a method to accept the properties 
//	- define a method to show the properties 
//	- Take information for 5 Employee 
//	- define main() method
