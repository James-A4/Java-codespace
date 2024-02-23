public class Caesar {

    public static char rotate(int shift, char character) {
        if (Character.isLetter(character)) {
            int base = Character.isLowerCase(character) ? 'a' : 'A';
            return (char) (((character - base + shift) % 26 + 26) % 26 + base);
        }
        return character;
    }

    public static String rotateString(int shift, String content) {
        StringBuilder rotatedContent = new StringBuilder();
        for (char character : content.toCharArray()) {
            rotatedContent.append(rotate(shift, character));
        }
        return rotatedContent.toString();
    }

    public static void main(String[] args) {
        if (args.length == 2) {
            int shift;
            try {
                shift = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid shift value!");
                System.out.println("Usage: java Caesar n \"cipher text\"");
                return;
            }
            String rotatedContent = rotateString(shift, args[1]);
            System.out.println(rotatedContent);
        } else if (args.length > 2) {
            System.out.println("Too many parameters!");
            System.out.println("Usage: java Caesar n \"cipher text\"");
        } else {
            System.out.println("Too few parameters!");
            System.out.println("Usage: java Caesar n \"cipher text\"");
        }
    }
}

