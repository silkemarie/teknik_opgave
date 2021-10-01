public class Metoder2Opgaver {
  public static void main(String[] args) {
    String text1 = "Hewwo";
    String text2 = "Mw. President.";
    indtastetSkrift(text1, text2);
    text1 = "Hi";
    text2 = "Madam President.";
    indtastetSkrift("Silke", "Lotus");
    System.out.println();
    indtastetSkrift2(text1, text2, '\t');
    }

    public static void indtastetSkrift(String text1, String text2) {

    System.out.print(text1 + " " + text2);
    }

  public static void indtastetSkrift2(String text1, String text2, char tegn) {

    System.out.print(text1 + tegn + text2);
  }
}
