import java.util.Random;

public class excercise {

  static Random random = new Random(); //klasse scope

  public static void main(String[] args) {
    int x = 5;
    kastTerning(); //kan være tom
    kastTerning();
    kastTerning();
    kastTerning();
    kastTerning();
    kastTerning();
    kastTerning();

  }
  public static void kastTerning() { //tal er parameter
    int terningKast = random.nextInt(6)+1;
    if (terningKast == 6) {
      System.out.println("Du har vundet!");
    }
    else {
      System.out.println("Du har tabt!");
    }

    System.out.println(terningKast);
  }
}
