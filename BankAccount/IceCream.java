package enumeratedTypes;

/**
 * Demonstrates the use of enumerated types.
 */

public class IceCream
{
	/**
	 * An enumerated type of ice cream flavors.
	 * The initial constant is assigned an ordinal of zero.
	 */
	 enum Flavor {vanilla, chocolate, strawberry, fudgeRipple, coffee,
	              rockyRoad, mintChocolateChip, cookieDough}
	
	 /**
	  * Creates and uses variables of the Flavor type.
	  * @param args A string array that can contain command-line arguments
	  */
	 public static void main (String[] args)
	 {
	    Flavor cone1, cone2, cone3;
	
	    cone1 = Flavor.rockyRoad;
	    cone2 = Flavor.chocolate;
	      
	    System.out.println ("cone1 value: " + cone1);
	    System.out.println ("cone1 ordinal: " + cone1.ordinal());
	    System.out.println ("cone1 name: " + cone1.name());
	
	    System.out.println ();
	    System.out.println ("cone2 value: " + cone2);
	    System.out.println ("cone2 ordinal: " + cone2.ordinal());
	    System.out.println ("cone2 name: " + cone2.name());
	
	    cone3 = cone1;
	
	    System.out.println ();
	    System.out.println ("cone3 value: " + cone3);
	    System.out.println ("cone3 ordinal: " + cone3.ordinal());
	    System.out.println ("cone3 name: " + cone3.name());
	    
	    Flavor[] flavorList = Flavor.values();
	    System.out.println ();
	    for (Flavor f:flavorList)
	    {
	    	System.out.print(f + "\n");
	    }
	    System.out.println ();
	 }
}
