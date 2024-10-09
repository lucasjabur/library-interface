public class Video {

  private final String title;
  private final String author;
  private final String duration;

  public Video(String title, String author, String duration) {
    this.title = title;
    this.author = author;
    this.duration = duration;
  }

  @Override
  public String toString() {
    return "Vídeo: " + " " + title + ", " + author + ", " + duration;
  }

}
