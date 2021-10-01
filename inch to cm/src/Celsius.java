import java.util.Scanner;

public class Celsius {
  public static void main(String[] args) {

    int fahrenheit;
    double celsius;

    Scanner temp = new Scanner(System.in);
    System.out.print("Fahrenheit to Celsius converter\n");
    System.out.print("Degrees in Fahrenheit: ");
    fahrenheit = temp.nextInt();

    double fahrenheitToCelsius = (fahrenheit - 32) * 5 / 9;

    System.out.println(fahrenheit + " degrees Fahrenheit = " + fahrenheitToCelsius + " degrees Celsius.");
  }
}
