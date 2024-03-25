public interface cipher {

    String encrypt(String plaintext);
    String decrypt(String cryptotext);
}


public abstract class Substitution implements cipher {


    public abstract char encrypt(char c);
    public abstract char decrypt(char c);


    public String encrypt(String plaintext) {
        FullString encryptedString = new FullString();
        for (char c : plaintext.toCharArray()) {
            encryptedString.append(encrypt(c));
        }
        return encryptedString.toString();
    }

    public String decrypt(String cryptotext) {
        FullString decryptedString = new FullString();
        for (char c : cryptotext.toCharArray()) {
            decryptedString.append(decrypt(c));
        }
        return decryptedString.toString();
    }

} 