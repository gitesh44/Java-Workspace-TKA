package abstract_Class2;

public class Circle extends Shape {
	
	private double radius;
	public double pi=3.14;
	
    public Circle(double radius) {
    	this.radius=radius;
    }
	@Override
	public double calculateArea() {
		double area=pi+radius*radius;
		return pi*radius*radius;
		
	}

	@Override
	public double calculatePerimeter() {
		return 2 * pi * radius;
		
		
	}

}
