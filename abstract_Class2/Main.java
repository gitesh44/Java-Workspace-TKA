package abstract_Class2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Shape circle = new Circle(5.0);
		 System.out.println("Circle Area: " + circle.calculateArea());
	        System.out.println("Circle Perimeter: " + circle.calculatePerimeter()); 

	        Shape triangle = new Traingle(3, 4, 5);
	        System.out.println("Triangle Area: " + triangle.calculateArea());
	        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());

	}
}