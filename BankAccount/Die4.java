package methodoverloading;


/**
 * Represents one die (singular of dice) with faces showing values
 * between 1 and 6.
 * 
 * @author Qi Wang
 * @version 1.1
 */

public class Die4
{
	/**
	 * Maximum face value
	 */
	private final int MAX = 6; 
	
	/**
	 * The face value of this die
	 */
	private int faceValue;  
	
	/**
	 * Creates a die object with initial face value 1.
	 */
	public Die4()
	{
	  //this.faceValue = 1;
		this(1);
	}
	
	/**
	 * Creates a die object with a face value.
	 * @param faceValue This die's face value
	 */
	public Die4(int faceValue)
	{
	  this.faceValue = faceValue;
	}
		
	/**
	 *  Rolls the die and returns the result.
	 *  
	 *  @return An integer specifying the face value of this die
	 */
	public int roll()
	{
	  this.faceValue = (int)(Math.random() * MAX) + 1;
	
	  return this.faceValue;
	}
	
	/**
	 *  Changes the Face value.
	 *  
	 *  @param value the face value of this die
	 */ 
	public void setFaceValue (int faceValue)
	{
		if ( faceValue >= 1 && faceValue <= MAX)
	        this.faceValue = faceValue;
	}
	
	/**
	 *  Retrieves Face value.
	 *  
	 *  @return An integer face value of this die
     */
	public int getFaceValue()
	{
	  return this.faceValue;
	}
	
	/**
	 *  Returns a string representation of this die.
	 *  
	 *  @return A String representation of this die
	 */
	public String toString()
	{
		return "Die: " + this.faceValue;
	}
	
	/**
	 * Compares two Die objects.
	 * 
	 * @return returns true if this die has the same face value as the other,
	 *         returns false otherwise.
	 */
	public boolean equals(Object other)
	{
		if (!(other instanceof Die4))
		    return false;
		Die4 d = (Die4)other;
		return this.faceValue == d.faceValue;
	}
}

