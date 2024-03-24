public class Caesar {
    public static String rotate(int shift, String text) {
        // Implementation of the rotate method
        // ...
    }
}
public class Brutus {
    public static final double[] english = {
        0.0855, 0.0160, 0.0316, 0.0387, 0.1210, 0.0218, 0.0209, 0.0496, 0.0733,
        0.0022, 0.0081, 0.0421, 0.0253, 0.0717, 0.0747, 0.0207, 0.0010, 0.0633,
        0.0673, 0.0894, 0.0268, 0.0106, 0.0183, 0.0019, 0.0172, 0.0011
    };

    public static void main(String[] args){
        String sentence = args[0];
        int number = 0;

        if(args.length != 1){  

            if (args.length <= 0){
                System.out.println("Too few parameters!");
            }
            else{
                System.out.println("Too many parameters!");
            }

            System.out.println("Usage: java Brutus \"cipher text\"");
            return;
        }   

        String longestString = "";
        // ...

                double longestChiSquard = 100000;

                for (int i = 0; i < 26 ; i++){
                    sentence = Caesar.rotate(i,sentence);
                    double chiSquared = chiSquared(frequency(sentence),english);

                    if(chiSquared < longestChiSquard){
                        longestChiSquard = chiSquared;
                        longestString = sentence;
                    }
                }

                System.out.println(longestString);
        public class Caesar {
            public static String rotate(int shift, String text) {
                // Implementation of the rotate method
                // ...
            }
        }
    }

    public static int[] count(String sentence){
        int[] arrayLetters = new int[26];

        for(int i = 0 ; i < sentence.length() ; i++){
            char myChar = sentence.charAt(i);

            if(myChar >= 'a' && myChar <= 'z'){
                int charNumber = myChar - 'a';      
                arrayLetters[charNumber] = arrayLetters[charNumber] + 1; 
            }
            else if(myChar >= 'A' && myChar <= 'Z'){
                int charNumber = myChar - 'A';
                arrayLetters[charNumber] = arrayLetters[charNumber] + 1;
            }
        }
        return arrayLetters;
    }
    
    public static double[] frequency(String sentence){
        double[] frequency = new double[26];
        int totalCharacters = 0;

        for (int i = 0; i < sentence.length() ; i++){
            char myChar = sentence.charAt(i);

            if(myChar >= 'a' && myChar <='z'){
                frequency[myChar - 'a']++;
                totalCharacters++;
            }
        }

        for (int i = 0; i < 26; i++) {
            frequency[i] /= totalCharacters;
        }
        return frequency;   
    }

    public static double chiSquared(double[] frequency, double[] english){
        double chi = 0;
    
        for (int i = 0 ; i < 26 ; i++){
            double difference = frequency[i] - english[i];
            double equation = difference * difference;
            chi += equation/english[i]; 
        }

        return chi;
    }
}
