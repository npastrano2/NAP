package staticmember;

/**
 * Demonstrates the use of the static modifier.
 */
public class SloganCounter
{
	/**
	 * Creates several Slogan objects and prints the number of
	 * objects that were created.
	 * @param args A String array that can contain command-line arguments
	 */
	public static void main (String[] args)
	{
	  Slogan s1, s2, s3;
	
	  s1 = new Slogan ("Remember the Alamo.");
	  System.out.println (s1);
	 	
	  s2 = new Slogan ("Don't Worry. Be Happy.");
	  System.out.println (s2);
	
	 s3 = new Slogan ("Live Free or Die.");
	 System.out.println (s3);
	
	  System.out.println();
	 System.out.println ("Slogans created: " + Slogan.getCount());
	}
}

