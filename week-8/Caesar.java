import java.util.Scanner;

public class Caesar {

    public static void main(String[] args) {
            if (args.length < 2) {
                System.out.println("Too few parameters!");
                System.out.println("Usage: java Caesar encryp n \"cipher text\"");
                return;
            } else if (args.length > 2) {
                System.out.println("Too many parameters!");
                System.out.println("Usage: java Caesar encrypt n \"cipher text\"");
                return;
            }

            int shift;
            try {
                shift = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.out.println("Shift value not valid");
                return;
            }

            String input = args[2];

            String result;
            if (args[0].equals("encrypt")) {
                result = rotate(shift, input);

            }
                return;
            }

            System.out.println(result);
        }
        try {
            shift = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            return;
        }

        String input = args[1];

        String encryptedText = rotate(shift, input);
        System.out.println(encryptedText);
    }

    public static char rotate(int shift, char c) {
        if (!Character.isLetter(c)) {
            return c;
        }

        int integerShift = (int) c + shift;
        char newChar;

        if (Character.isLowerCase(c)) {
            newChar = (char) ((integerShift - 'a' + 26) % 26 + 'a');
        } else {
            newChar = (char) ((integerShift - 'A' + 26) % 26 + 'A');
        }

        return newChar;
    }

    public static String rotate(int shift, String text) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            encryptedText.append(rotate(shift, c));
        }

        return encryptedText.toString();
    }
}

  
