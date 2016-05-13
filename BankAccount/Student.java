package staticmember;

import classrelationship.Address;

/**
 * Represents a college student.
 */

public class Student
{
	/**
	 * The first name of this student
	 */
	 private String firstName;
	 /**
	  * The last name of this student
	  */
	 private String lastName;
	 /**
	  * The home address of this student
	  */
	 private Address homeAddress;
	 /**
	  * The school address of this student
	  */
	 private Address schoolAddress;
	 
	 /**
	  * The student id of this student
	  */
	 private int sid;
	 /**
	  * The next unique student id
	  */
	 private static int nextId = 1;
	
	 /**
	  * Creates a student with the specified values.
	  * @param firstName The first name of this student
	  * @param lastName The last name of this student
	  * @param homeAddress The home address of this student
	  * @param schoolAddress The school address of this student
	  */
	 
	 public Student (String firstName, String lastName, Address homeAddress, Address schoolAddress)
	 {
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.homeAddress = homeAddress;
	    this.schoolAddress = schoolAddress;
	    this.sid = nextId;
	    nextId++;
	 }
	 
	 public Student (String firstName, String lastName)
	 {

	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.homeAddress = null;
	    this.schoolAddress = null;
	    this.sid = nextId;
	    nextId++;
	 }
	
	 /**
	  * Returns a string description of this Student object.
	  * @return A string representation of this student
	  */
	 public String toString()
	 {
	    String result;
	
	    result = this.firstName + " " + this.lastName + "\n";
	    result += "Home Address:\n" + this.homeAddress + "\n";
	    result += "School Address:\n" + this.schoolAddress;
	    result += "\nStudent ID:\n" + this.sid;
	
	    return result;
	 }
}
