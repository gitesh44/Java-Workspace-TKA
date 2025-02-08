package abstarct_class6;

public class Cube extends VolumeCalculator{
	private int side;
	
	public Cube(int side){
		this.side=side;
		
	}
	double calculateVolume() {
		
		return side*side*side;
	}
	
	

}

//cube is: Volume = side x side x side.
