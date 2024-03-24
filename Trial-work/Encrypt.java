public class Encrypt {

    public static void main(String[] args) {
        
        String text = "What's the weather like?";
        System.out.println(text);

        char[] chars = text.toCharArray();

        for(char c : chars) {
            c += 1;
            System.out.print(c);
        }
        


        
    }
    
}
