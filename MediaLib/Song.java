public class Song {
    private String title;
    private int rating;

    public Song(String t)
    {
        title = t;
        rating = 0;
    }

    public String getTitle() {
        return title;
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
        String info = "Song title is" + title;
        if (rating != 0) 
        { 
          info += ", rating is " + rating;
        }
        return info;
    }

    public boolean equals(Song s)
    {
      if (this.title.equals(s.title) && this.rating == s.rating)
      {
        return(true);
      }
      else{
        return(false);
      }
    }
    
}
