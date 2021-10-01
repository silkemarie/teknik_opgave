import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {
    int age;
    String text;

    Scanner in = new Scanner(System.in);
    System.out.print("Type your age here: ");
    age = in.nextInt();

    System.out.print("Thank you! Your age: " + age + " years old.");


  }

}
