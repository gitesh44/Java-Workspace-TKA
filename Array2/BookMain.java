package Array2;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book arr[]=new Book[3];
		
		
		Book.accept(arr);
		Book.show(arr);
		
		Book.Sort(arr);
		System.out.println();
		System.out.println();
		System.out.println();
		Book.show(arr);
		
		
	}

}

//create a class Book 
//- define properties of Book - name,author,price,quantity,total
//- define a method to accept the properties 
//- define a method to show the properties 
//- Take information of 5 Book 
//- define main() method
