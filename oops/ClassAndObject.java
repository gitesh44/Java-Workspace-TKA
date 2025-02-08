/*
Properties of Java Classes
--Class is not a real-world entity. It is just a template or blueprint or prototype from which objects are created.
--Class does not occupy memory.
--Class is a group of variables of different data types and a group of methods.
--Class is a logical entity.

--A Class in Java can contain:
------->Data member
------->Method
------->Constructor
------->Nested Class
------->Interface



Java Objects
--An object in Java is a basic unit of Object-Oriented Programming and 
  represents real-life entities. 
--Objects are the instances of a class that are created to use the attributes and methods of a class.  
--A typical Java program creates many objects, which as you know, interact by invoking methods. 
--Object name is reference variable
--An object is a physical entity.


An object consists of :
State : It is represented by attributes of an object. It also reflects the properties of an object.
Behavior : It is represented by the methods of an object. It also reflects the response of an object with other objects.
Identity : It gives a unique name to an object and enables one object to interact with other objects.
Example of an object: dog



*/


package oops;

public class ClassAndObject {
	String car;
	int model;
	String type;
	String place;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
        ClassAndObject c1=new ClassAndObject(); //object got created......c1 is not an object,it is an name for an object
        c1.model=563;
        c1.car="Gwagon";
        c1.type="Four wheel";
        c1.place="Pune";
        
        System.out.println(c1.car);
        System.out.println(c1.model);
        System.out.println(c1.type);
        System.out.println(c1.place);  
	}

}







