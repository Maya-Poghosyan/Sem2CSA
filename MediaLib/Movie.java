public class Movie {

    private String title;
    private double duration;
    private int rating;

    public Movie(String t, double d)
    {
        title = t;
        duration = d;
        rating = 0;
    }

    public String getTitle() {
        return title;
      }
    
    public double getDuration()
    {
        return duration;
    }
      
    public int getRating()
    {
        return rating;
    }

    public void adjustRating(int rate)
    {
        if (rating >= 0 && rating <= 10)
        {
          rating += rate;
        }
        else{
          System.out.println("Make sure the rating is between 0 and 10 inclusive.");
        }
    }
      
    public String toString() 
    {
        String info = "\"" + title + "\", lasts " + duration + " hours";
        if (rating != 0) 
        { 
          info += ", rating is " + rating;
        }
        return info;
    }

    public boolean equals(Movie m)
    {
      if (this.title.equals(m.title) && this.duration == m.duration)
      {
        return(true);
      }
      else{
        return(false);
      }
    }
}
