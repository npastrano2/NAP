package enumeratedTypes;

/**
 * Demonstrates the use of a full enumerated type.
 */

public class SeasonTester
{
	 /**
	  * Iterates through the values of the Season enumerated type.
	  * @param args A string array that can contain command-line arguments
	  */
	 public static void main (String[] args)
	 {
		//Notice that there are only four instances in Season enum.
	    for (Season time : Season.values())
	    {
	       System.out.println (time + "\t" + time.getSpan());
	    }
	 }
}
