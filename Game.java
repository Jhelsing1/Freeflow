public class Game extends Genre
{
   private String Name;
   private double Hours;
   private int score;
   public Game()
   {
      super();
      Name = "None Selected";
      Hours = 0;
      score = 0;
   }
   public Game(String Name,String Genre, double Hours)
   {
      super(Genre);
      if(Name.equals(""))
      {
         this.Name = "None Selected";
         this.Hours = 0;
      }
      else
      {
         this.Name = Name;
         this.Hours = Hours;
      }
      score = 0;
   }
   public Game(String Name,String Genre, double Hours, int score)
   {
      super(Genre);
      if(Name.equals(""))
      {
         this.Name = "None Selected";
         this.Hours = 0;
         this.score = 0;
      }
      else
      {
         this.Name = Name;
         this.Hours = Hours;
         if(Hours == 0)
            this.score = 0;
         else
            this.score = score;
      }
      score = 0;
   }
   public void getGameInfo()
   {
      System.out.println("Showing game info: ");
   }
}