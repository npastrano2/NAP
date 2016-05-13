package staticmember;
import classrelationship.Address;


public class StudentTest {
	public static void main(String[] args)
	{
		Address a = new Address("Ellison","San Antonio","TX", 78251);
		Address b = new Address("Ellison","San Antonio","TX", 78251);
		Student s1 = new Student("Jay", "Smith", a, b);
		Student s2 = new Student("Jay2", "Smith2", a, b);
		Student s3 = new Student("Jay3", "Smith3");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}

}
