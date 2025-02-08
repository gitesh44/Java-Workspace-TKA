package abstarct_class6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VolumeCalculator v1=new Cylinder(6.3,2.2);
		System.out.println("The Voulme of Cube is" +v1.calculateVolume());

		VolumeCalculator v2=new Cube(6);
		System.out.println("The Voulme of Cube is" +v2.calculateVolume());

		VolumeCalculator v3=new Sphere(6.0);
		System.out.println("The Voulme of Sphere is" +v3.calculateVolume());

		
	}

}
