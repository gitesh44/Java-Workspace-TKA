package Constructor;

import java.util.Scanner;

public class Student {
    private int Rollno;
    private String name;
    private String NameOfCollege;
    private String Remark;
    private String Address;
    
    // Set the Roll number
    public void setvalueRoll() {
        Rollno = 89;  // Directly assign to the instance variable
    }

    // Get the Roll number
    public void getvalueRoll() {
        System.out.println(Rollno);  // Print the instance variable
    }

    // Set the name
    public void setvaluename() {
        name = "Gitesh";  // Directly assign to the instance variable
    }

    // Get the name
    public void getvaluename() {
        System.out.println(name);  // Print the instance variable
    }

    // Set the Name of College
    public void setvaluenameofCollege() {
        NameOfCollege = "XYZ College";  // Assign a value to the instance variable
    }

    // Get the Name of College
    public void getvaluenameofCollege() {
        System.out.println(NameOfCollege);  // Print the instance variable
    }

    // Accept all values and print them
    public void AcceptValue() {
        setvalueRoll();
        getvalueRoll();

        setvaluename();
        getvaluename();

        setvaluenameofCollege();
        getvaluenameofCollege();
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.AcceptValue();
    }
}
