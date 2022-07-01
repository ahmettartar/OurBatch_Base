package day03;

public class StringUtil {

    /*
reverse
create a method that will accept a String and return the reversed version
*/
    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    /*
Frequency of Character
create a method that will accept a word(String) and a letter (char) and return
how many times that given letter is found in the given word
*/
    public static int frequencyOfCharacter(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

}
