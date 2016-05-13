package methodoverloading;

public class TestDie {
	 /**
	  * Creates a few dices and display them.
	  * @param args A string array that can contain command-line arguments
	  */
	 public static void main (String[] args)
	 {
	     Die4 die1 = new Die4();
	     Die4 die2 = new Die4(3);
	     System.out.println(die1 + "\n" + die2);
	 }
	

}
