package enumeratedTypes;

/**
 *  Enumerates the values for Season. A season class that has four instances ONLY.
 *
 *  enum Season {winter, spring, summer, fall}
 */
public class Season2
{
   /**
    * The months of this season
    */
   private String span;

   /**
    * Sets up each value with an associated string.
    * @param months The month span
    */
   public Season2 (String months)
   {
      this.span = months;
   }

   /**
    * Returns the span message for this value.
    * @return A string literal specifying the span of the season
    */
   public String getSpan()
   {
      return this.span;
   }
}
