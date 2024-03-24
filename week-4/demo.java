import your.package.Caesarr; // Import the missing class
public class demo {
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

    String greatestString = "";
    double greatestChiSquard = 100000;

    for (int i = 0; i < 26 ; i++){
        sentence = Caesarr.rotate(i,sentence);
        double chiSquared = chiSquared(frequency(sentence),english);

        if(chiSquared < greatestChiSquard){
            greatestChiSquard = chiSquared;
            greatestString = sentence;
        }
    }

    System.out.println(greatestString);

    }


    public static int[] count(String sentence){
        int[] arrayAlphabet = new int[26];  // This creates a new array whith a length-26 index 

        for(int i = 0 ; i < sentence.length() ; i++){
            char myChar = sentence.charAt(i);

            if(myChar >= 'a' && myChar <= 'z'){
                int charNumber = myChar - 'a';      
                //example: myChar = 'c'   --->    'c' - 'a' =  99-97 = 2  ,   
                //arrayAlphabet[0] = a, [1] = b, [2]=c ......
                arrayAlphabet[charNumber] = arrayAlphabet[charNumber] + 1; 
            }
            else if(myChar >= 'A' && myChar <= 'Z'){
                int charNumber = myChar - 'A';
                arrayAlphabet[charNumber] = arrayAlphabet[charNumber] + 1;
            }
        }
        return arrayAlphabet;
    }
    
    public static double[] frequency(String sentence){
        double[] frequency = new double[26];
        int totalAlphabet = 0;

        for (int i = 0; i < sentence.length() ; i++){
            char myChar = sentence.charAt(i);

            if(myChar >= 'a' && myChar <='z'){
                frequency[myChar - 'a']++;
                totalAlphabet++;
            }
        }

        for (int i = 0; i < 26; i++) {
            frequency[i] /= totalAlphabet;
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
    



