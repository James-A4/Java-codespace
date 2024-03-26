public class MonoAlphaSubstitution extends Substitution {



    private char[] originalLetters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private char[] mappedLetters = new char[26];



    public MonoAlphaSubstitution() {
        this.mappedLetters = this.originalLetters.clone();
    }


    
    public MonoAlphaSubstitution(String mapping) {
        this();
        for (int i = 0; i < mapping.length() - 1; i += 2) {
            char original = mapping.charAt(i);
            char newChar = mapping.charAt(i + 1);
            int originalValue = new String(originalLetters).indexOf(original);
            if (originalValue != -1) {
                mappedLetters[originalValue] = newChar;
            }
        }
    }


    public char encrypt(char ch) {
        int originalValue = new String(originalLetters).indexOf(ch);
        return originalValue != -1 ? mappedLetters[originalValue] : ch;
    }



    public char decrypt(char ch) {
        int mappedValue = new String(mappedLetters).indexOf(ch);
        return mappedValue != -1 ? originalLetters[mappedValue] : ch;
    }



    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println(args.length < 3 ? "Too few parameters!" : "Too many parameters!");
            System.out.println("Usage: java MonoAlphaSubstitution process key \"cipher text\"");
            return;
        }



        String process = args[0];
        String key = args[1];
        String text = args[2];


        MonoAlphaSubstitution cipher = new MonoAlphaSubstitution(key);


        if ("encrypt".equals(process)) {
            for (char ch : text.toCharArray()) {
                System.out.print(cipher.encrypt(ch));
            }


        } else if ("decrypt".equals(process)) {
            for (char ch : text.toCharArray()) {
                System.out.print(cipher.decrypt(ch));
            }


        } else {
            System.out.println("The first parameter must be \"encrypt\" or \"decrypt\"!");
            System.out.println("Usage: java MonoAlphaSubstitution process key \"cipher text\"");
        }
    }
}
