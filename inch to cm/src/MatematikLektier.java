public class MatematikLektier {
  public static void main(String[] args) {

    int y = 9;
    int a = 2;
    int b = 4;
    double c = 4.5;

    System.out.println("Square root of y is: " + Math.sqrt(y));
    System.out.println("The greater number of " + a + " and " + b + " is " + Math.max(a,b));
    System.out.println("Next closest decimal of " + a + " = " + Math.nextDown(a));
    System.out.println("Round " + c + " = " + Math.round(c));

  }
}
