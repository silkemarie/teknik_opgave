import java.util.Scanner;

public class BMI {
  public static void main(String[] args) {

    //BMI = kg / m2
    double meter;
    double vægt;

    Scanner BMICalc = new Scanner(System.in);
    System.out.print("Skriv din vægt i kg: ");
    vægt = BMICalc.nextDouble();
    BMICalc.nextLine();
    System.out.print("Skriv din højde i meter: ");
    meter = BMICalc.nextDouble();
    BMICalc.nextLine();

    System.out.println("Din BMI er: " + vægt / (Math.pow(meter, 2)));

  }
}
