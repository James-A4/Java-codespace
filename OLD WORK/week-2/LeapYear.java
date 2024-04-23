import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a year: ");
        int year = scanner.nextInt();

        System.out.println(isLeapYear(year));

        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        boolean leapYear;

        if (year % 4 == 0) 
            if((year % 100 == 0) && (year % 400 != 0)) {
                leapYear = false; 
            }
            else {
                leapYear = true;
            }
        else {
            leapYear = false;
        }

        return leapYear;
    }
}
