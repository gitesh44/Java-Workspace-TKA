package oops;

import java.util.Scanner;

class Student23 {
    String name;
    String rollNumber;
    int age;
    String gender;
    String address;
    String department;
    int yearOfStudy;
}

class Department {
    String name;
    String facultyId;
    String department;
    String designation;
    String email;
    String phoneNumber;
    String qualification;
    int experience;
    String specialization;
}

class Courses {
    String courseId;
    String courseName;
    String courseCode;
    String description;
    int credits;
    String department;
    String instructorName;
    String instructorEmail;
    int duration;
}

class Laboratory {
    String labId;
    String labName;
    String department;
    String location;
    String equipment; 
    int capacity;
    int availableComputers;
    String specialFacilities;
}

class Library {
    String libraryId;
    String libraryName;
    String location;
    int capacity;
    int totalBooks;
    int availableBooks;
}

class AdminOffice {
    String adminOfficeId;
    String officeName;
    String location;
    String headName;
    int staffCount;
    String workingHours;
}

class PrincipalOffice {
    String officeId;
    String principalName;
    String contactNumber;
    String email;
    String meetingSchedule;
}

class AccountSection {
    String accountSectionId;
    String departmentHead;
    String contactNumber;
    int staffCount;
}

class Fees {
    String feeId;
    String studentId;
    double totalFees;
    double feesPaid;
    double dueFees;
    String paymentDate;
    String dueDate;
    String paymentMethod;
}

class Workshop {
    String workshopId;
    String workshopName;
    String instructorName;
    int duration;
    String startDate;
    String endDate;
    int maxParticipants;
    int currentParticipants;
}

class Activity {
    String activityId;
    String activityName;
    String organizer;
    String date;
    String time;
    String location;
    int participants;
    String description;
}

class Sports {
    String sportsId;
    String sportName;
    String coachName;
    int teamSize;
    String practiceSchedule;
    String location;
    boolean tournamentParticipation;
    String achievements; // List of achievements
}

public class Student2 {
    public static void main(String[] args) {
    	
    	
//------------------------------------For Student class--------------------------------------------
    	
        Student23 S1 = new Student23();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name--->  ");
        S1.name = sc.nextLine();

        System.out.println("Enter roll no--->  ");
        S1.rollNumber = sc.nextLine();

        System.out.println("Enter age--->  ");
        S1.age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter gender--->  ");
        S1.gender = sc.nextLine();

        System.out.println("Enter Address--->  ");
        S1.address = sc.nextLine();

        System.out.println("Enter department--->  ");
        S1.department = sc.nextLine();

        System.out.println("Enter year of study--->  ");
        S1.yearOfStudy = sc.nextInt();
        sc.nextLine(); 
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + S1.name);
        System.out.println("Roll Number: " + S1.rollNumber);
        System.out.println("Age: " + S1.age);
        System.out.println("Gender: " + S1.gender);
        System.out.println("Address: " + S1.address);
        System.out.println("Department: " + S1.department);
        System.out.println("Year of Study: " + S1.yearOfStudy);

       // sc.close(); // Close the Scanner
        
//--------------------------------For Department Class------------------------
        
        
        class Department {
            String name;
            String facultyId;
            String department;
            String designation;
            String email;
            String phoneNumber;
            String qualification;
            int experience;
            String specialization;
        }
        
        Department d1=new Department();
        
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the detail");
        d1.name=sc1.nextLine();


        
    }
}
