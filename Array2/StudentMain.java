package Array2;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student arr[]=new Student[4];
		
		Student.objAccept(arr);
		Student.objShow(arr);
		System.out.println("------------>>>");
		Student.Sort(arr);
		Student.objShow(arr);
		
		
	}

}
