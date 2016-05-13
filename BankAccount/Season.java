package enumeratedTypes;

/**
 *  Enumerates the values for Season.
 *
 *  enum Season {winter, spring, summer, fall}
 */
public enum Season
{
   //Notice that these are the only four instances of this enum class.
   winter ("December through February"),
   spring ("March through May"),
   summer ("June through August"),
   fall ("September through November");

   private String span;

   /**
    * Sets up each value with an associated string.
    * @param months The month span
    */
   private Season (String months)  // only private modifier is allowed
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
