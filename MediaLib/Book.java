/*
 * Activity 2.5.7
 *
 * A Book class for the MediaLibrary program
 */
public class Book
{
  private String title;
  private String author;
  private int rating;
  
  /*** Constructor ****/
  public Book(String t, String a)
  {
    title = t;
    author = a;
    rating = 0;
    System.out.println("Adding book " + t);
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }
  
  public int getRating() {
    return rating;
  }
  
  public String toString() 
  {
    String info = "\"" + title + "\", written by " + author;
    if (rating != 0) 
    { 
      info += ", rating is " + rating;
    }
    return info;
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  public void setAuthor(String a) {
    author = a;
  }

  public void adjustRating(int r)
  {
    if (rating >= 0 && rating <= 10)
    {
      rating += r;
    }
    else{
      System.out.println("Make sure the rating is between 0 and 10 inclusive.");
    }
    System.out.println("Adjusting rating by " + r);
  }

  public boolean equals(Book b)
  {
    if (this.author.equals(b.author) && this.title.equals(b.title))
    {
      return(true);
    }
    else{
      return(false);
    }
  }
  // public String getInfo()
  // {
  //   return "The current book information is " + info;
  // }
}
