package abstract_Class;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal lion=new Lion(); //parent class reference,child class object---------
		Animal Tiger=new Tiger();
		
		
		lion.sound();
		Tiger.sound();

	}

}
