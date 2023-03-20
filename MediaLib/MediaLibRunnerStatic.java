// code by Maya Poghosyan
 // optional step 24

public class MediaLibRunnerStatic {
    public static void main(String[] args)
    {
        System.out.println(MediaLib.getOwner() + "'s Library"); // step 1
        MediaLib.changeOwner("Maya"); // step 8
        System.out.println(MediaLib.getOwner() + "'s Library");
        System.out.println(MediaLib.getNumEntries()); // step 14
        MediaLib newLib = new MediaLib();
        MediaLib newLib2 = new MediaLib();
        Movie menu = new Movie("The Menu", 1.5);
        Movie rcru = new Movie("Robinson Crusoe", 2);
        Book sncd = new Book("Snow Falling on Cedars", "David Guterson");
        Book homl = new Book("Hands on ML", "O'Reilly");
        newLib.addBook(homl);
        newLib.addBook(sncd);
        newLib2.addMovie(rcru);
        newLib2.addMovie(menu);
        System.out.println("The first library has " + newLib.getNumEntries() + " entries"); // step 17
        System.out.println("The second library has " + newLib2.getNumEntries() + " entries"); // step 17

        // testing out equals method for songs
        Song s1 = new Song("Generictitle");
        newLib.addSong(s1);
        Song s2 = new Song("Generictitle");
        System.out.println(s1.equals(s2));

    }
    
}
