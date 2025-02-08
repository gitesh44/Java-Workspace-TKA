package abstract_Class2;

public class Traingle extends Shape {
	
	private int s1;
	private int s2,s3;


	public Traingle(int a,int b,int c) {
		this.s1=a;
		this.s2=b;
		this.s3=c;
		
	}
	//@Override
	public double calculateArea() {
		double area=(s1+s2+s3)/2;
		return area;
		
	}

	
	//@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		double perimeter=s1+s2+s3;
		return perimeter;
		
	}

}
