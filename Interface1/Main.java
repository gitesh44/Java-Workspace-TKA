package Interface1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stubn
		Employee e1=new FulltimeEmployee("Mayur", 235683, "TKA",25000.50);
		e1.calculateSalary(2000);
		
		System.out.println();
		Employee e2=new PartimeEmployee("Gitesh", 500, 20);
		e2.calculateSalary(2000.00);
		

		
	}

}
