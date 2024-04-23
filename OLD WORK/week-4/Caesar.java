public class Caesar {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println(args.length < 2 ? "Too few parameters!" : "Too many parameters!");
            System.out.println("Usage: java Caesar n \"cipher text\"");
            return;
        }

        int shift = Integer.parseInt(args[0]);
        String text = args[1];
        System.out.println(encryptText(shift, text));
    }

    public static String encryptText(int shift, String text) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            encryptedText.append(Character.isLetter(currentChar) ? encryptChar(shift, currentChar) : currentChar);
        }

        return encryptedText.toString();
    }

    public static char encryptChar(int shift, char ch) {
        if (!Character.isLetter(ch)) {
            return ch;
        }

        int asciiOffset = Character.isLowerCase(ch) ? 'a' : 'A';
        int originalPosition = ch - asciiOffset;
        int newPosition = (originalPosition + shift) % 26;

        return (char) (newPosition + asciiOffset);
    }
}
