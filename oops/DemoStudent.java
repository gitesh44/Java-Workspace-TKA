package oops;
import java.util.*;

public class DemoStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.name="Gitesh";
		s1.id=232;
		s1.phone=925155524;
		System.out.println(s1.name);
		System.out.println(s1.id);
		System.out.println(s1.phone);
		
		//By Taking Scanner class in Object
		Student s2=new Student();
		Scanner sc= new Scanner(System.in);
		System.out.println("ENther the name--> ");
		s2.name=sc.next();
		
		System.out.println("Enter the ID of student");
		s2.id=sc.nextInt();
		
		System.out.println("Enter your phone number--> ");
		s2.phone=sc.nextLong();
		
		
		System.out.println();
		System.out.println(s2.name);
		System.out.println(s2.id);
		System.out.println(s2.phone);
		
	}

}
