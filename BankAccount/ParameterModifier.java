package passingparameters;

/**
 * Demonstrates the effects of changing parameter values.
 */


public class ParameterModifier
{
	/**
	 * Modifies the parameters, printing their values before and
	 * after making the changes.
	 * @param f1 The first parameter
	 * @param f2 The second parameter
	 * @param f3 The third parameter
	 */
	public void changeValues (int f1, Number f2, Number f3)
	{
	  System.out.println ("Before changing the values:");
	  System.out.println ("f1\tf2\tf3");
	  System.out.println (f1 + "\t" + f2 + "\t" + f3 + "\n");
	
	  f1 = 999;
	  f2.setValue(888);
	  f3 = new Number (777);
	
	  System.out.println ("After changing the values:");
	  System.out.println ("f1\tf2\tf3");
	  System.out.println (f1 + "\t" + f2 + "\t" + f3 + "\n");
	}
}

