import java.util.Scanner;

public class Opgave1 {
  public static void main(String[] args) {
    int a = 2;
    final int b = 3;
    a = a + b;
    //b = a + b;

    System.out.println(a + " and " + b); //"2 and 3" i første omgang. "5 and 3" i anden omgang.
    // "java: cannot assign a value to final variable b" i tredje omgang, da b allerede er final.
    //hvis der skal køres med en ny b value, skal b altså ikke opskrives som final int, men blot int.
  }
}








  /*public static void main(String[] args) {
    double a = 1;
    double b = 2;
    double c = 3;
    double d = 4;
    double e = 5;

    double sum = a + b + c + d + e;
    double average = sum / 5;

    System.out.println("Sum = " + sum);
    System.out.println("Average = " + average);

  }
}*/





    /*Opgave 2
    double tal1;
    double tal2;
    Scanner scan = new Scanner(System.in);
    System.out.print("Input the first value here: ");
    tal1 = scan.nextDouble();
    System.out.print("Input the second value here: ");
    tal2 = scan.nextDouble();

    String onePlusTwo = tal1 + " + " + tal2 + " = ";
    double add = tal1 + tal2;
    String oneMinusTwo = tal1 + " - " + tal2 + " = ";
    double subtract = tal1 - tal2;
    String oneTimesTwo = tal1 + " * " + tal2 + " = ";
    double multiply = tal1 * tal2;
    String division = tal1 + " / " + tal2 + " = ";
    double divide = tal1 / tal2;

    System.out.println("The result of: ");
    System.out.println("adding " +  onePlusTwo + add);
    System.out.println("subtracting " + oneMinusTwo + subtract);
    System.out.println("multiplying " + oneTimesTwo + multiply);
    System.out.println("dividing " + division + divide);

  }
}*/





  /*Opgave 1
  public static void main(String[] args) {
    int a = 5;
    int b = 10;
    double c = 12.5;
    String d = "Java programming";

    System.out.println(a + ", " + b + ", " + c + ", and " + d);
  }
}  */

