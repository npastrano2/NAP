package staticmember;

/**
 * Represents a single slogan string.
 * @version 1.1
 */ 
public class Slogan
{
	/**
	 * The phrase of the slogan
	 */
	private String phrase;
	/**
	 * The number of slogans created
	 */
	private static int count = 0;
	
	/**
	 * Creates a slogan with a phrase and counts the number of slogan
	 * instances created.
	 * @param phrase The phrase of the slogan
	 */
	public Slogan (String phrase)
	{
	  this.phrase = phrase;
	  count++;
	}
	
	/**
	 * Changes the phrase of the slogan
	 * @param phrase The phrase of the slogan
	 */
	public void setPhrase(String phrase)
	{
		this.phrase = phrase;
	}
	
	/**
	 * Returns the phrase of the slogan
	 * @return A String literal of the slogan
	 */
	public String getPhrase()
	{
		return this.phrase;
	}
	
	/**
	 * Returns this slogan as a string.
	 * @return A String literal specifying the slogans
	 */
	public String toString()
	{
	  return "The slogan is " + this.phrase;
	}
	
	/**
	 * Returns the number of instances of this class that have been
	 * created.
	 * @return The number of slogans that have been created
	 */
	public static int getCount ()
	{
	  return count;
	}
	
	/**
	 * Compares this slogan with the other slogan. Returns true
	 * if this slogan is the same as the other, false otherwise.
	 * @return A boolean value specifying whether this slogan is 
	 *         the same as the other
	 */
	public boolean equals(Object obj)
	{
		if (!(obj instanceof Slogan))
			return false;
		
		Slogan other = (Slogan) obj;
		return this.phrase.equalsIgnoreCase(other.phrase);
	}
}

