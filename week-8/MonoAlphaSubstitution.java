public class MonoAlphaSubstitution extends Substitution {


    public static char originalLetters[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                                            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                                            'u', 'v', 'w', 'x', 'y', 'z'};
    

    public static char mappedLetters[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
                                          'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                                          'u', 'v', 'w', 'x', 'y', 'z'};


    public MonoAlphaSubstitution(String mapped) {

        for (int i = 0; i < mapped.length() - 1; i+=2) {
            char original = mapped.charAt(i);
            char new = mapped.charAt(i + 1);

            int originalValue = new String(originalLetters).indexOf(original);

            if (originalValue != -1) {
                mappedLetters[originalValue] = new;
            }
        }
    }
    




    public char encrypt(char ch) {
        ////
        ////
        ////
        return ch;
    }



    public char decrypt(char ch) {
        ///
        ////
        ////
        return ch;
    }
}
