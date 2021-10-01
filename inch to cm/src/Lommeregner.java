import java.util.Scanner;

public class Lommeregner {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Indtast et tal: ");
    double tal1 = scan.nextDouble();

    System.out.print(" + ");
    double tal2 = scan.nextDouble();

    double beregnResultat = sum(tal1, tal2);

    System.out.print(" = " + beregnResultat);

  }

  public static double sum(double tal1, double tal2) {
    return (tal1 + tal2);

  }
}
