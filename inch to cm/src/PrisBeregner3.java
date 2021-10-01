import java.util.Scanner;

public class PrisBeregner3 {

    public static void main(String[] args) {
      double værdi = indtastetVærdi();
      double prisInklMoms = prisBeregner(værdi);

      udskriv(prisInklMoms);
    }

    public static double indtastetVærdi() {
      Scanner in = new Scanner(System.in);
      System.out.print("Indtast prisen ekskl. moms: ");

      return in.nextDouble();
    }

    public static double prisBeregner(double prisEksMoms) {
      double prisInklMoms;
      double moms;

      moms = 1.25;
      prisInklMoms = prisEksMoms * moms;

      return prisInklMoms;
    }

    public static void udskriv(double prisInklMoms) {
      System.out.println("Pris inklusiv moms: " + prisInklMoms + " kr.");
  }
}
