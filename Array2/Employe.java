package Array2;
import java.util.Scanner;

public class Employe {
	private String name;
	private String post;
	private double salary;
	
	Scanner sc=new Scanner(System.in);
	
	public void accept() {
		System.out.println("name-->>> ");
		name=sc.nextLine();
		
		System.out.println("post-->>> ");
		post=sc.nextLine();
		
		System.out.println("salary-->> ");
		salary=sc.nextDouble();
	}
	
	public void show() {
		System.out.println("name is:- " +name);
		System.out.println("Post is:- " +post);
		System.out.println("Salary is:- " +salary);
	}
	
	public static void acceptvalue(Employe arr[]) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=new Employe();
			arr[i].accept();
		}
	}
	
	public static void showMethod(Employe arr[]) {
		for(int i=0;i<arr.length;i++) {
			arr[i].show();
		}
	}
	public static void Sort(Employe arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;i=j++) {
				if(arr[i].salary>arr[j].salary) {
					Employe temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
	}
	
	
	
	
	

}
