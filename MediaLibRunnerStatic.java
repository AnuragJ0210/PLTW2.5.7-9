public class MediaLibRunnerStatic {
public static void main(String[] args) {
  System.out.println(MediaLib.getOwner() + "'s Library");
  System.out.println(MediaLib.changeOwner("frog"));
  System.out.println(MediaLib.getOwner() + "'s Library");


    MediaLib myLib = new MediaLib();
    Movie myMovie = new Movie("The Matrix", 1.6);
    myLib.addMovie(myMovie);
    Movie myMoviee = new Movie("Groggie", 1.6);
    myLib.addMovie(myMoviee);
    System.out.println(myLib);

    MediaLib myLib2 = new MediaLib();
    Book newBook = new Book("To Kill a Mockingbird", "Lee");
    myLib2.addBook(newBook);
    System.out.println(myLib2);
  


}
  
}