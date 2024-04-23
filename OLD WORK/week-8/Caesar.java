import java.util.Scanner;

public class Caesar {
    private int shift;

    public Caesar(int shift) {
        this.shift = shift;
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter an integer shift value: ");
        int shift = Integer.parseInt(scanner.nextLine());


        System.out.println("Please enter text to be encrypted: ");
        String text = scanner.nextLine();

        String encryptedText = rotate(shift, text);


        System.out.println(encryptedText);
    }




    public static String rotate(int shift, String text) {

        StringBuilder outcome = new StringBuilder();
        for (char ch : text.toCharArray()) {
            outcome.append(rotate(shift, ch));

        }
        return outcome.toString();
    }






    public static char rotate(int shift, char ch) {
        if (Character.isUpperCase(ch)) {
            return (char) ('A' + (ch - 'A' + shift) % 26);
        } else if (Character.isLowerCase(ch)) {
            return (char) ('a' + (ch - 'a' + shift) % 26);

        } else {
            return ch;
        }
    }
}
