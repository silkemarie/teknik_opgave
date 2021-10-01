public class ligeantaltegn {
  public static void main(String[] args) {
    String text = "Hej";
    boolean svar = ligeAntal(text);
    System.out.println(svar);
  }
  public static boolean ligeAntal(String x) {
    int antal = x.length();

    if (antal % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }
}
