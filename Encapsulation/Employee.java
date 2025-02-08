package Encapsulation;
import java.util.Scanner;

public class Employee {
    int id;
    public String name;
    private String email;
    public String position;
    private double salary;
    public String education;

    // For ID
    public void setId() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your ID: ");
        id = sc.nextInt();
    }

    public void getId() {
        System.out.println("ID: " + id);
    }

    // For Name
    public void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.next();
    }

    public void getName() {
        System.out.println("Name: " + name);
    }

    // For Email
    public void setEmail() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email: ");
        this.email = sc.next();
    }

    public void getEmail() {
        System.out.println("Email: " + email);
    }

    // For Salary
    public void setSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        this.salary = sc.nextDouble();
    }

    public void getSalary() {
        System.out.println("Salary: " + salary);
    }

    // For Education
    public void setEducation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your education: ");
        education = sc.next();
    }

    public void getEducation() {
        System.out.println("Education: " + education);
    }

    
    public void acceptValues() {
        setId();
        setName();
        setEmail();
        setSalary();
        setEducation();
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.acceptValues();
        System.out.println("\nEmployee Details:");
        e1.getId();
        e1.getName();
        e1.getEmail();
        e1.getSalary();
        e1.getEducation();
    }
}
