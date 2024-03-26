public class Vigenere extends Substitution {



    private String key;
    private int position;
    private Caesar[] ciphers;


    public Vigenere() {
        this("A"); // A Caesar cipher with a shift of 0 is the identity
    }



    public Vigenere(String key) {
        this.key = key;
        this.position = 0;
        this.ciphers = new Caesar[key.length()];
        for (int i = 0; i < key.length(); i++) {
            int shift = key.charAt(i) - 'A';
            ciphers[i] = new Caesar(shift);
        }
    }



    public char encrypt(char ch) {
        char encrypted = ciphers[position].encrypt(ch);
        position = (position + 1) % key.length();
        return encrypted;
    }


    
    public char decrypt(char ch) {
        char decrypted = ciphers[position].decrypt(ch);
        position = (position + 1) % key.length();
        return decrypted;
    }
}