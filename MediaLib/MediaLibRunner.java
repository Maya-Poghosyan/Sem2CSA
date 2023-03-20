/*
 * Activity 2.5.7
 * 
 * The runner for the MediaLibrary program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    // steps 1-15

    // create a new library and book
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();
    Book myBook = new Book("The Lord of the Rings", "Tolkien");
    System.out.println("Book created" + myBook);
    // add book to library
    myLib.addBook(myBook);
    System.out.println("Library:\n" + myLib);
    // adjust rating by 5
    int myRating = 5;
    myBook.adjustRating(myRating);
    System.out.println(myBook);
    // change title and verify
    myBook.setTitle("New Title");
    System.out.println("Book: " + myBook);
    System.out.println("Library: " + myLib);

    // new algorithm on step 15

    System.out.println("You have a NEW library");
    MediaLib myLib2 = new MediaLib();
    Book newBook = new Book("To Kill a Mockingbird", "Lee");
    myLib2.addBook(newBook);
    newBook = new Book("1984", "Orwell");

    // test
    System.out.println("before test:" + newBook);
    myLib.testBook(newBook);
    System.out.println("after test:" + newBook);

    // try out book equals method

    Book newBook2 = new Book("Yet another new title?", "Orwell");
    System.out.println(newBook.equals(newBook2));

    // ERROR - you don't get to access this outside the book class!
    //System.out.println(newBook2.title);
    Movie madagascar = new Movie("Madagascar", 1.25);
    myLib2.addMovie(madagascar);
    System.out.println(myLib2);


  }
}