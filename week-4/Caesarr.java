public class Caesarr{
    public static void main(String[] args) {
    
    /**
     * @param args The sentence that need to be encrypted
     */


    if(args.length != 2){    
        if (args.length < 2){
            System.out.println("Too few parameters!");
        }else{
            System.out.println("Too many parameters!");
        }
        System.out.println("Usage: java Caesar n \"cipher text\"");
        return;
    }   

    int shiftOfLevel = Integer.parseInt(args[0]);  // first argument is an integer, indicates the level of shift for this time
    String sentence = args[1];   //second arguments is the sentences that we need to encrypt to caesar word 
    System.out.println(rotate(shiftOfLevel, sentence));  // 
    }
    /**
     * recall the rotate function by using shift of level, and sentence
     */


    public static String rotate(int shiftOfLevel, String sentence){     //this function is to differentiate the letter, and create a new string to ouput the caesaar word
    StringBuilder output = new StringBuilder();    //Using StringBuilder command to creat a new String, will use this new String frequently later

    for(int i = 0; i < sentence.length(); i++){     // loop how many times regarding to the index[] of the sentence, including space
        char ch = sentence.charAt(i);   //to select a specific word in the sentence, create a new char, using charAt() to define the specific one
        
        if(Character.isLetter(ch)){     //to differrentiate whether the specific index[i] is a letter or a space
            output.append(rotate(shiftOfLevel, ch));    //if it is, connected to another rotate function, by using shift of level and that specific char
        }
        else{
            output.append(ch);  //if it is a space, just add it into the string
        }
    }
        return output.toString();   // memorise the current value of String "output", then loop again 
    }
    /**
     * Returns the alphabet into the new created String
     * 
     * @return the specific alphabet
     */


    public static char rotate(int shiftOfLevel, char ch){   //this function is to encrypt the char to a caesar word with specific shift of level

    if (Character.isLetter(ch)) {  
        int charNumber = ch;    //turn the char into it's own related number
        int afterShift = charNumber + shiftOfLevel;     //According to ASCII value, from 'a' to 'Z' have their own related number
        
        if (Character.isLowerCase(ch)) {    //lower case region is from 97 to 122
            if (afterShift > 'z') {
                afterShift -= 26;
            } 
            else if (afterShift < 'a') {
                afterShift += 26;
            }
        } 

        else if (Character.isUpperCase(ch)) {   //upper case region is from 65 to 90
            if (afterShift > 'Z') {
                afterShift -= 26;
            } 
            else if (afterShift < 'A') {
                afterShift += 26;
            }
        }
        return (char) afterShift;  
        //memorise the current int 'aftershift', and using (char) command to change the integer to char, 
        //once the specific integer convert to char, it will show up as it equivalent alphabet according to it's number

        /**
         * Returns the int aftershift, and using (char) to turns it into the specific alphabet
         * 
         * @return the (char) aftershift
         */
    }
    return ch; 
    }

}
