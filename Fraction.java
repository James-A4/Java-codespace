import java.util.Scanner;

public class Fraction {

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        double numerator, denominator, result;

        System.out.print ("Enter Numerator: ");
        numerator = scanner.nextInt ();
        System.out.print ("Enter Denominator: ");
        denominator = scanner.nextInt ();
        System.out.println ();

        result = numerator / denominator;

        System.out.println (numerator + "/" + denominator + "=" + result);
    }
}
