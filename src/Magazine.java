public class Magazine {

  private final String title;
  private final String org;
  private final String vol;
  private final String number;
  private final String year;

  public Magazine(String title, String org, String vol, String number, String year) {
    this.title = title;
    this.org = org;
    this.vol = vol;
    this.number = number;
    this.year = year;
  }

  @Override
  public String toString() {
    return "Revista: " + " " + title + ", " + org + ", " + vol + ", " + number + ", " + year;
  }
}
