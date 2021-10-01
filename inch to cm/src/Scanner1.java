import java.util.Scanner;

public class Scanner1 {
  public static void main(String[] args) {
    String firstName;
    String lastName;
    String klasse;
    String phoneNumber;
    String email;
    int birthYear;
    int areaCode;
    double gpa;
    double pi;
    boolean yesOrNo;
    boolean trueOrFalse;

    Scanner in = new Scanner(System.in);
    System.out.print("Hi! Please fill out your \nFirst name: ");
    firstName = in.nextLine();
    System.out.print("Last name: ");
    lastName = in.nextLine();
    System.out.print("Class: ");
    klasse = in.nextLine();
    System.out.print("Phone number: ");
    phoneNumber = in.nextLine();
    System.out.print("Email: ");
    email = in.nextLine();
    System.out.print("Birthyear: " );
    birthYear = in.nextInt();
    in.nextLine(); //to fix int bug
    System.out.print("Area code: ");
    areaCode = in.nextInt();
    in.nextLine();
    System.out.print("GPA: ");
    gpa = in.nextDouble();
    in.nextLine();
    System.out.print("The first three digits of PI: ");
    pi = in.nextDouble();
    in.nextLine();
    System.out.print("You have a driver's licence? True/False: ");
    yesOrNo = in.nextBoolean();
    System.out.print("You are a Danish citizen? True/False: ");
    trueOrFalse = in.nextBoolean();



    System.out.println("\nYour details: ");
    System.out.println("First name: " + firstName);
    System.out.println("Last name: " + lastName);
    System.out.println("Class: " + klasse);
    System.out.println("Phone number: " + phoneNumber);
    System.out.println("Email: " + email);
    System.out.println("Birth year: " + birthYear);
    System.out.println("Area code: " + areaCode);
    System.out.println("GPA: " + gpa);
    System.out.println("PI: " + pi);
    System.out.println("Driver's licence: " + yesOrNo);
    System.out.println("Danish citizen: " + trueOrFalse);
    System.out.println("\nThank you!");
  }
}
