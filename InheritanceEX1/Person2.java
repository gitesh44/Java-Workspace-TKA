package InheritanceEX1;

import java.util.Scanner;

public class Person2 {
	private String name;
	private String add;
	private int mob;
	
	public Person2() {
		
	}
	
	Scanner sc=new Scanner(System.in);
	
		public void setName(String name) {
			this.name = name;
		}
		public void setAddress(String address) {
			this.add = address;
		}
		public void setMob(int mob) {
			this.mob = mob;
			
		}
		
		
		//setter
		
		public String getName() {
			return name;
		}

		public int getMob() {
			return mob;
		}


		public String getAddress() {
			return add;
		}


		
		public void acceptMethod() {
			System.out.println("Enter the name--> ");
			setName(sc.next());
			
			System.out.println("Enter mob--> ");
			setMob(sc.nextInt());
			
			System.out.println("Enter address--> ");
			setAddress(sc.next());
			
			
			
		}
		
		public void showMethod() {
			getName();
			getMob() ;
			getAddress();
			
			
			
		}
		
	}

