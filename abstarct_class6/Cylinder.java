package abstarct_class6;

public class Cylinder extends VolumeCalculator {
	private double radius;
	public double pi=3.14;
	private double height;
	
    public Cylinder(double radius,double height) {
    	this.radius=radius;
    	this.height=height;
    }
    
    double calculateVolume() {
		
		return pi*radius*radius*height;
	}
	  
	
//A cylinder's volume is π r² h

}
