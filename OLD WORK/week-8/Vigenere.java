public class Vigenere extends Substitution {



    public Vigenere() {
        this("A"); // A Caesar cipher with a shift of 0 is the identity
    }



    public Vigenere(String key) {
    
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