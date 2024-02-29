import java.util.Scanner;

public class CShanty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many rounds we doin' mateys?");
        int n = scanner.nextInt();
        scanner.nextLine();


        for(int i = n; i > 0 ; i--) {
            System.out.println("Soon may the compiler come,");
            System.out.println("To bring class files and exceptions");
        }

        System.out.println("High level languages earn my rum");
        System.out.println("But my first love is the C!");

        scanner.close();
    }
}
