package Array2;

public class MaxMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		MaxNumber m1=new MaxNumber();
		m1.acceptData(arr);
		m1.display(arr);
		m1.getmax(arr) ;
		m1.getmin(arr);
		m1.getsecMax(arr);
		m1.getsecMin(arr);

	}

}
