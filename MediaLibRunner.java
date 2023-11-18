/*
* Activity 2.5.9
*/
import java.util.Scanner;

public class MediaLibRunner
{
  public static void main(String[] args)
  {
    MediaLib myLib1 = new MediaLib();
    myLib1.addBook(new Book("1984", "Orwell"));
    System.out.println("Library1:\n" + myLib1);
     // wait a bit to get a new date
    System.out.println("Wait a second or two so Library 2 has a different time.");
    System.out.print("Press <ENTER> to continue...");
    Scanner s = new Scanner(System.in);
    String temp = s.nextLine();

    MediaLib myLib2 = new MediaLib();
    myLib2.addSong(new Song("In Your Eyes", 3.5));
    System.out.println("Library2:\n" + myLib2);
    //./MediaLibRunnerScope.java:14: error: reached end of file while parsing
  }
}