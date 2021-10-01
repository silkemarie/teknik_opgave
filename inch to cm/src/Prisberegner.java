import java.util.Scanner;

public class Prisberegner {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int prisEksMoms; //opgave a

    //Indhent pris
    System.out.print("Indtast pris uden moms: ");
    prisEksMoms = input.nextInt();

    double moms = UdregnMoms(prisEksMoms);

    //printer
    System.out.println();

  }
  public static double UdregnMoms( int prisEksMoms) {
    double prisInklMoms = prisEksMoms * 1.25;
    return prisInklMoms;
  }
}
