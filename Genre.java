public class Genre 
{
   private String Genre;
   private static int amount = 0;
   public Genre()
   {
      Genre = "None Selected";
      amount++;
   }
   public Genre(String genre)
   {
      this.Genre = genre;
      amount++;
   }
   public String getGenre() 
   {
      return Genre;
   }
   public void setGenre(String newGenre)
   {
      Genre = newGenre;
   }
   public static int getAmount()
   {
      return amount;
   }
}
