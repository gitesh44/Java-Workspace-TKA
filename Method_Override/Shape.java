package Method_Override;

public class Shape {
	
	
	
	public int Area(int length,int width) {
		return 0;
		
	}

}
class Rectangle extends Shape{
	public int Area(int length,int width) {
		return length * width;
		
	}
}
