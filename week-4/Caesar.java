public class Caesar{
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

    int shiftOfLevel = Integer.parseInt(args[0]);  // The first argument is for the integers, this shows the level of the shift
    String sentence = args[1];   //The second arguments is for the strings that we need to be be able to decipher to reveal what we need
    System.out.println(rotate(shiftOfLevel, sentence));  // 
    }
    /**
     * We can recall the rotate function by using size of shift and sentence structure
     */


    public static String rotate(int shiftOfLevel, String sentence){     //This next function is to differentiate the letter, and create a new string to ouput the decrypted word
    StringBuilder output = new StringBuilder();    //We can use the StringBuilder command to creat a new String, this will be used later on

    for(int i = 0; i < sentence.length(); i++){     // We can loop how many times we need to to uncover the whole sentence
        char ch = sentence.charAt(i);   //This part of the code allows us to select a specific part of the sentence
        
        if(Character.isLetter(ch)){     //This allows us to highlight whether the specific index[i] is a letter or a space
            output.append(rotate(shiftOfLevel, ch));    //if it is, connected to another rotate function, by using shift of level and that specific character
        }
        else{
            output.append(ch);  //if it is a space, we can add it to the string
        }
    }
        return output.toString();   // We need to memorise the current value of String "output", then loop again 
    }
    /**
     * Returns the alphabet into the new created String
     * 
     * @return the specific alphabet
     */


    public static char rotate(int shiftOfLevel, char ch){   // This function is to encrypt the character to a caesar word with a specifc sized shift

    if (Character.isLetter(ch)) {  
        int charNumber = ch;    //Now the character can become it's own related number
        int afterShift = charNumber + shiftOfLevel;     //According to ASCII value, from 'a' to 'Z' have their own related number
        
        if (Character.isLowerCase(ch)) {    //The lower case region is from 97 to 122
            if (afterShift > 'z') {
                afterShift -= 26;
            } 
            else if (afterShift < 'a') {
                afterShift += 26;
            }
        } 

        else if (Character.isUpperCase(ch)) {   //The upper case region is from 65 to 90
            if (afterShift > 'Z') {
                afterShift -= 26;
            } 
            else if (afterShift < 'A') {
                afterShift += 26;
            }
        }
        return (char) afterShift;  
        //The current int 'aftershift' can be memorised, and using the (char) command, the integer can be changed to a character
        //After the specific integer has been converted to a  character, it will show up as its equivalent letter according to its number

        /**
         * Returns the int aftershift, and using (char) to turns it into the specific alphabet
         * 
         * @return the (char) aftershift
         */
    }
    return ch; 
    }

}
