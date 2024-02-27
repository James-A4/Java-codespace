public class Brutusatt {

    public static final double[] english = {
        0.0855, 0.0160, 0.0316, 0.0387, 0.1210, 0.0218, 0.0209, 0.0496, 0.0733,
        0.0022, 0.0081, 0.0421, 0.0253, 0.0717, 0.0747, 0.0207, 0.0010, 0.0633,
        0.0673, 0.0894, 0.0268, 0.0106, 0.0183, 0.0019, 0.0172, 0.0011
    };

    public static int[] count(String content) {
        int[] counts = new int[26];
        content = content.toLowerCase();
        for (char character : content.toCharArray()) {
            if (Character.isLetter(character)) {
                int index = character - 'a';
                counts[index]++;
            }
        }
        return counts;
    }

    public static double[] frequency(String content) {
        int[] counts = count(content);
        double[] frequencies = new double[26];
        int totalLetters = content.length();
        for (int i = 0; i < 26; i++) {
            frequencies[i] = (double) counts[i] / totalLetters;
        }
        return frequencies;
    }

    public static double chiSquared(double[] freq1, double[] freq2) {
        double chiSquared = 0.0;
        for (int i = 0; i < 26; i++) {
            double observed = freq1[i];
            double expected = freq2[i];
            chiSquared += Math.pow(observed - expected, 2) / expected;
        }
        return chiSquared;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Too few or too many parameters!");
            System.out.println("Usage: java Brutus \"cipher text\"");
            return;
        }
        String content = args[0];
        String result = decipher(content);
        System.out.println(result);
    }

    public static String decipher(String content) {
        double[] cipherFreq = frequency(content);
        double minChiSquared = Double.MAX_VALUE;
        int bestShift = 0;
        for (int shift = 0; shift < 26; shift++) {
            double[] shiftedFreq = new double[26];
            for (int i = 0; i < 26; i++) {
                int shiftedIndex = (i - shift + 26) % 26;
                shiftedFreq[i] = english[shiftedIndex];
            }
            double chiSquared = chiSquared(cipherFreq, shiftedFreq);
            if (chiSquared < minChiSquared) {
                minChiSquared = chiSquared;
                bestShift = shift;
            }
        }
        return shift(content, bestShift);
    }

    public static String shift(String content, int shift) {
        StringBuilder decryptedContent = new StringBuilder();
        for (char character : content.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                char shiftedChar = (char) ((character - base - shift + 26) % 26 + base);
                decryptedContent.append(shiftedChar);
            } else {
                decryptedContent.append(character);
            }
        }
        return decryptedContent.toString();
    }
}

