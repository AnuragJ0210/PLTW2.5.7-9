public class Song{
  private String title;
  private double duration;
  private int rating;

  public Song(String t, double d) {
    title = t;
    duration = d;
    rating = 0;
  }

  public String getTitle() {
    return title;
  }

  public double getDuration() {
    return duration;
  }

  public int getRating() {
    return rating;
  }

  public void setTitle(String t) {
    title = t;
  }

  public void setDuration(double d) {
    duration = d;
  }

  public void adjustRating(int r) {
    if (r >= 0 && r <= 10) {
      rating += r;
    }
    else{
      System.out.println("Rating out of range");
    }
  }

  public String toString() 
  {
    String info = "\"" + title + "\", duration: " + duration + " hours";
    if (rating != 0) { 
      info += ", rating is " + rating;
    }
    return info;
  }

  public boolean equals(Song m){
    if (title.equals(this.title) && duration == this.duration){
      return true;
    }
    else{
      return false;
    }
  }
}