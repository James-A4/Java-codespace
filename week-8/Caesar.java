import java.util.Scanner;

public class Caesar {


    public static void main(String[] args) {

        if(args.length != 2){    
            if (args.length < 2){
                System.out.println("Too few parameters!");
            }else{
                System.out.println("Too many parameters!");
            }
            System.out.println("Usage: java Caesar n \"cipher text\"");
            return;
        }   



        
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Please enter integer shift value: ");
        int shift;
        try {
            shift = Integer.parseInt(scanner.nextLine());
        }
            return;
        }
        System.out.println("Please enter text to encrypt: ");
        String message = scanner.nextLine();
        
        
        System.out.println(new String);

    }

        
        public static char rotate(int shift, char ch) {

            if (Character.isUpperCase(ch)) {
                return (char) ('A' + (ch - 'A' + shift) % 26);
            } else if (Character.isLowerCase(ch)) {
                return (char) ('a' + (ch - 'a' + shift) % 26);
            } else {
                return ch;
            }
        }

        public static String rotate(int shift, String text) {
            StringBuilder newString = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {

                newString.append(rotate(shift, text.charAt(i)));

            }
            return newString.toString();
        }



    }
}


         
