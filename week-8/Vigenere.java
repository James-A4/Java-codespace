import java.util.Arrays;

public class Vigenere {
    
}
public class Vigenere extends Substitution {
    private String keyword;
    private int position;

    public Vigenere() {
        this.keyword = "";
        this.position = 0;
    }

    public Vigenere(String keyword) {
        this.keyword = keyword;
        this.position = 0;
    }

    @Override
    public char encrypt(char c) {
        if (!Character.isLetter(c)) {
            return c;
        }

        int shift = keyword.charAt(position) - 'A';
        char encryptedChar = super.encrypt(c, shift);
        position = (position + 1) % keyword.length();
        return encryptedChar;
    }

    @Override
    public char decrypt(char c) {
        if (!Character.isLetter(c)) {
            return c;
        }

        int shift = keyword.charAt(position) - 'A';
        char decryptedChar = super.decrypt(c, shift);
        position = (position + 1) % keyword.length();
        return decryptedChar;
    }

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Too few parameters!");
            System.out.println("Usage: java Vigenere encrypt key \"cipher text\"");
            return;
        }

        String mode = args[0];
        String keyword = args[1];
        String text = String.join(" ", Arrays.copyOfRange(args, 2, args.length));

        Vigenere vigenere = new Vigenere(keyword);

        if (mode.equals("encrypt")) {
            String encryptedText = vigenere.encrypt(text);
            System.out.println(encryptedText);
        } else if (mode.equals("decrypt")) {
            String decryptedText = vigenere.decrypt(text);
            System.out.println(decryptedText);
        } else {
            System.out.println("The first parameter must be \"encrypt\" or \"decrypt\"!");
            System.out.println("Usage: java Vigenere encrypt key \"cipher text\"");
        }
    }
}