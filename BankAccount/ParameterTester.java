package passingparameters;

/**
 * Demonstrates the effects of passing various types of parameters.
 */
public class ParameterTester
{
	/**
	 * Sets up three variables (one primitive and two objects) to
	 * serve as actual parameters to the changeValues method. Prints
	 * their values before and after calling the method.
	 * @param args A reference to an String array that can 
	 *             contain command-line parameters
	 */
	public static void main (String[] args)
	{
	  ParameterModifier modifier = new ParameterModifier();
	
	  int a1 = 111;
	  Number a2 = new Number (222);
	  Number a3 = new Number (333);
	
	  System.out.println ("Before calling changeValues:");
	  System.out.println ("a1\ta2\ta3");
	  System.out.println (a1 + "\t" + a2 + "\t" + a3 + "\n");
	
	  modifier.changeValues (a1, a2, a3);
	
	  System.out.println ("After calling changeValues:");
	  System.out.println ("a1\ta2\ta3");
	  System.out.println (a1 + "\t" + a2 + "\t" + a3 + "\n");
	}
}

