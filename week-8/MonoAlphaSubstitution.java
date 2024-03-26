public class MonoAlphaSubstitution extends Substitution {
    private String translationTable;

    public MonoAlphaSubstitution(String translationTable) {
        this.translationTable = translationTable;
    }

    @Override
    public char encrypt(char c) {
        int index = translationTable.indexOf(c);
        if (index != -1) {
            return translationTable.charAt(index);
        }
        return c;
    }

    @Override
    public char decrypt(char c) {
        int index = translationTable.indexOf(c);
        if (index != -1) {
            return (char) ('A' + index);
        }
        return c;
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java MonoAlphaSubstitution encrypt|decrypt key \"cipher text\"");
            return;
        }

        String direction = args[0];
        String key = args[1].toUpperCase();
        String text = args[2].toUpperCase();

        MonoAlphaSubstitution cipher = new MonoAlphaSubstitution(key);

        if (direction.equals("encrypt")) {
            for (char c : text.toCharArray()) {
                System.out.print(cipher.encrypt(c));
            }
        } else if (direction.equals("decrypt")) {
            for (char c : text.toCharArray()) {
                System.out.print(cipher.decrypt(c));
            }
        } else {
            System.out.println("The first parameter must be \"encrypt\" or \"decrypt\"!");
            System.out.println("Usage: java MonoAlphaSubstitution encrypt|decrypt key \"cipher text\"");
        }
    }
}
