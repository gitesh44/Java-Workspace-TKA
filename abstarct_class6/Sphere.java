package abstarct_class6;

public class Sphere extends VolumeCalculator{
	private double radius;
	public double pi=3.14;
	public Sphere(double radius) {
		this.radius=radius;
	}
	
	double calculateVolume() {
		return (4/3 *pi*radius*radius*radius);
	}
}

// volume of a sphere is V = 4/3 π r³