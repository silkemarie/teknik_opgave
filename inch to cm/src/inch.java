import java.util.Scanner;

public class inch {

    public static void main(String[] args) {

        double inch;
        double cm;
        Scanner in = new Scanner(System.in);
        final double CM_PER_INCH = 2.54;

        //inches to cm
        System.out.print("Height in inches: ");
        inch = in.nextDouble();

        cm = inch * CM_PER_INCH;
        System.out.print(inch + " inches = ");
        System.out.println(cm + " cm");

        //cm to inches
        System.out.print("Height in cm: ");
        cm = in.nextDouble();

        inch = cm / CM_PER_INCH;
        System.out.print(cm + " cm = ");
        System.out.printf("%.2f", inch);
        System.out.println(" inches");

    }
}
