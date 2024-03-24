public class Encrypt {

    public static void main(String[] args) {

        int key = 6;
        
        String text = "What's the weather like?";
        System.out.println(text);

        char[] chars = text.toCharArray();

        for(char c : chars) {
            c += key;
            System.out.print(c);
        }
        


        
    }
    
}
