package InheritanceEX04;
import java.util.Scanner;

//Problem Statement:
//Design a program for a library management system. Create the following classes:
//Book (base class): Contains attributes like title, author, ISBN, and price.
//EBook (derived class): Inherits Book and adds attributes like fileSize, downloadLink,
//and format (e.g., PDF, EPUB). 
//Add a method to display eBook details 
//and calculate the download cost for members (overload with parameters like membership type).

public class Ebook extends Book{
	int kb;
	private double filesize,downloadCost;
	private String DownloadLink,format;
	
	Ebook(){
		acceptDetails1() ;
		
		
	}
	Scanner sc=new Scanner(System.in);
	
	public void setfilesize(double size) {
		this.filesize=size;
		
	}
	public double getfilesize() {
		return filesize;
	
	}
	public String getDownloadLink() {
		return DownloadLink;
	}
	public void setDownloadLink(String downloadLink) {
		DownloadLink = downloadLink;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	
	
	
	
	
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	public void acceptDetails1() {
		System.out.println("Enter the Size of file in Kb-->");
		setfilesize(sc.nextDouble());
		
//		System.out.println("Enter the Cost of Download-->");
//		setDownloadCost(sc.nextDouble());
		
		System.out.println("Enter the Link URL-->");
		setDownloadLink(sc.next());
		
		System.out.println("Enter the Format of Book (Softcopy or Hardcopy?) \n ");
		 setFormat(sc.next());
	}

		public void calculateDownload() {
			 if(filesize<40.0) {
				  downloadCost= filesize*50.0;
				 System.out.println("the download cost is--> "+downloadCost);
			 }
			 else if(filesize>40.0) {
				  downloadCost= filesize*100.0;
				 System.out.println("the download cost is--> "+downloadCost);
			 }
			 else {
				  downloadCost= filesize*150.0;
				 System.out.println("the download cost is--> "+downloadCost);
			 }
			 
		}
		
		
		
	public void showDetails1() {
		System.out.println("\nBook Details:");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("ISBN: " + getISBN());
        System.out.println("Price: " + getPrice());

        System.out.println("\nEBook Details:");
        System.out.println("File Size: " + getfilesize() + " KB");
        //System.out.println("Download Cost: " + getDownloadCost());
        System.out.println("Download Link: " + getDownloadLink());
        System.out.println("Format: " + getFormat());
        calculateDownload();
        
        
	}
	
	
	
	

}
