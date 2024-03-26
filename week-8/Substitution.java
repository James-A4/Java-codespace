public abstract class Substitution implements Cipher {

    public abstract char encrypt(char ch);
    public abstract char decrypt(char ch);
    
    
    public String decrypt(String cryptotext) {
        StringBuilder decryptedText = new StringBuilder();
        for (char ch : cryptotext.toCharArray()) {
            decryptedText.append(decrypt(ch));
        }
        return decryptedText.toString();
    }


    public String encrypt(String plaintext) {
        StringBuilder encryptedText = new StringBuilder();
        for (char ch : plaintext.toCharArray()) {
            encryptedText.append(encrypt(ch));
        }
        return encryptedText.toString();
    }
}
