package Array2;
import java.util.Scanner;

public class Student {
	private String name;
	private int id;
	private String mail;
	private int age;
	
Scanner sc=new Scanner(System.in);
	
	public void accept() {
		System.out.println("name-->>> ");
		name=sc.nextLine();
		
		System.out.println("id-->>> ");
		id=sc.nextInt();
		
		System.out.println("mail-->> ");
		mail=sc.next();
		
		System.out.println("age-->> ");
		age=sc.nextInt();
	}
	public void show() {
		System.out.println("name is:- " +name);
		System.out.println("id  is:- " +id);
		System.out.println("mail is:- " +mail);
		System.out.println("age is:- " +age);
		
	}
	
	public static void objAccept(Student arr[]) {
		for(int i=0;i<arr.length;i++) {
			arr[i]= new Student();
			arr[i].accept();
			
		}
	
	}
	public static void objShow(Student arr[]) {
		for(int i=0;i<arr.length;i++) {
			arr[i].show();
		}
		}
	
	public static void Sort(Student arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].age>arr[j].age) {
					Student temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}

}
