import java.util.Scanner;

public class takeaway {
  public static void main(String[] args) {
    String adresse;
    double levering = 25.0;
    String num1 = "Hawaii";
    String num2 = "Pepperoni";
    String num3 = "Kartoffel";

    String pizza;
    int hawaii = 65;
    int pepperoni = 83;
    int kartoffel = 89;

    Scanner scan = new Scanner(System.in);

    System.out.println("Menukort\n1. Hawaii pizza 65kr\n2. Pepperoni pizza 83kr\n3. Kartoffel pizza 89kr");
    System.out.print("Pizza num ønsket: ");
    pizza = scan.nextLine();
    System.out.println("Pris i alt: " + (levering + hawaii) + " kr"); //pizza opskrevet som metode først
    System.out.print("Din adresse her: ");
    adresse = scan.nextLine();
    System.out.println("Leveres til: " + adresse);
  }
}
