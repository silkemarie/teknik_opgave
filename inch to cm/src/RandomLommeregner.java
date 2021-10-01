import java.util.Random;
import java.util.Scanner;

public class RandomLommeregner {

  public static void main(String[] args) {
    Random rando = new Random();
    //Scanner scan = new Scanner(System.in);
    System.out.print("Dit første tilfældige nummer er: ");
    int tal1 = rando.nextInt(100) + 1 ; //sådan her sikrer vi os et tal mellem 1 og 100
    System.out.print(tal1);
    System.out.print(" + ");
    int tal2 = rando.nextInt(100) + 1;
    System.out.print(tal2);

    double beregnResultat = sum(tal1, tal2);

    System.out.print(" = " + beregnResultat);

  }

  public static double sum(double tal1, double tal2) {
    return (tal1 + tal2);

  }
}
