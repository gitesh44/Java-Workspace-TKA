package DailyPractice;

public class Encapsulation {
	private int id;
	public String name;
	private long mobile;
	
	
	
	public int getId() {
		
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	
	public void Display() {
		setId(23);
		System.out.println(getId());
		
		setName("GItesh");
		System.out.println(getName());
		
		setMobile(26323);
		System.out.println(getMobile());
	}
	

}
