/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;
  private String date = Date.getTime();
  // make static owner variable and changed to public access
  public static String owner = "PLTW";
  // add variable to track num entries
  private static int numEntries;
  // individual (non-static) entry tracker
  private int numIndEntries;

  // fixed the logic error of allowing multiple entries as part of step 22
  public void addBook(Book b)
  {
    date = Date.getTime();
    if (this.book == null)
    {
      book = b;
      numIndEntries++;
      numEntries++; // step 15
    }
    else {
      System.out.println("You can't add another book to this library, that would overwrite the current one."); // step 24
    }
  }

  // fixed the logic error of allowing multiple entries as part of step 22
  public void addMovie(Movie m)
  {
    date = Date.getTime();
    if (this.movie == null)
    {
      movie = m;
      numIndEntries++;
      numEntries++; // step 15
    }
    else {
      System.out.println("You can't add another movie to this library, that would overwrite the current one."); // step 24
    }
  }

  public void addSong(Song s)
  {
    date = Date.getTime();
    if (this.song == null)
    {
      song = s;
      numEntries++; // step 15
    }
    else {
      System.out.println("You can't add another song to this library, that would overwrite the current one."); // step 24
    }
  }

  public String showMovie()
  {
    return(movie.getTitle());
  }

  public String toString() 
  {
    String info = "Last updated at:" + date + ", Library contains:";
    if (movie != null)
    {
      info += "\nThe movie " + movie.toString();
    }
    if (book != null)
    {
      info += "\nThe book " + book.toString();
    }
    if (song != null)
    {
      info += "\nThe song" + song.toString();
    }

    return(info);
  }

  public void testBook(Book tester)
  {
    tester.setTitle("Yet another new title?");
    System.out.println("Title changed to: " + tester.getTitle());
  }

  // static/class-wide owner accessor, kept for redundancy
  public static String getOwner()
  {
    return(owner);
  }

  // static method to change owner string
  public static void changeOwner(String o)
  {
    owner = o;
  }

  // accessor method for numEtnries
  public static int getNumEntries()
  {
    return(numEntries);
  }
}