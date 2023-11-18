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
    // 6)
    // System.out.println("Adding book " + t);
    
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }
  
  public int getRating() {
    // 12)
    // return r;
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

  public void adjustRating(int r) {
    if (r >= 0 && r <= 10) {
      // 10)
      // System.out.println("Adjusting rating by " + r);
      rating += r;
    }
    else{
      System.out.println("Rating out of range");
    }
  }

  public boolean equals(Book b){
    // 8)
    // System.out.println("Checking book " + t);
    if (title.equals(this.title) && author.equals(this.author)){
      return true;
    }
    else{
      return false;
    }

    // 2-5)
    // public String getInfo()
    // {
    //    return "The current book information is " + info;
    // }
  }
}
