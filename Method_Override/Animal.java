package Method_Override;

public class Animal {
	
	public void makesound() {
		System.out.println("Sound?");
		
	}

}
class cat extends Animal{
public void makesound() {
		System.out.println("MEow");
	}
	
}
