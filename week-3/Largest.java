import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length of Array: ");
        int length = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        int[] myArray = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter an integer: ");
            myArray[i] = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
        }

        if (length > 0) {
            int largestValue = myArray[0]; // Initialize with the first element of the array

            for (int i = 1; i < length; i++) {
                if (myArray[i] > largestValue) {
                    largestValue = myArray[i];
                }
            }

            System.out.println("Largest value: " + largestValue);
        }

        scanner.close();
    }
}

