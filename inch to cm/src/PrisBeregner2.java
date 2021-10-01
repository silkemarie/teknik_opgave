import java.util.Scanner;

public class PrisBeregner2 {
  public static void main(String[] args) {
    //version uden return
    Scanner in = new Scanner(System.in);
    System.out.print("Indtast prisen ekskl. moms: ");
    int indtastetPris = in.nextInt();

    prisBeregner2(indtastetPris);
  }

  public static void prisBeregner2(double prisEksMoms) {

    double prisInklMoms;
    double moms = 1.25;

    prisInklMoms = prisEksMoms * moms;

    System.out.println("Pris inkl moms: " + prisInklMoms + " kr.");
  }
}
