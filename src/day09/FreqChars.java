package day09;

import java.util.LinkedHashMap;
import java.util.Map;

public class FreqChars {

    /*
        Given a String count how many times each character is in the String
        apple ->a:1
                p:2
                l:1
                e:1

        COZUM: 1-Normal COZUM
               2- Collection/Datatype ile cozum.

        Ex:
            apple
            a - 1
            p - 2
            l - 1
            e - 1
//
//
//   // Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2 */
//    public static String frequencyOfCharacters(String str){
//        String result = "";
//        int count = 1;
//        if (str.isEmpty() || str.isBlank()){
//            return "No Characters";
//        }
//        for (int i = 0; i < str.length()-1; i++) {
//            char a = str.charAt(i);
//            char b = str.charAt(i+1);
//            //result +=a;
//            if(a == b){
//                count++;
//                if(i==(str.length()-2)){//for last situation
//                    result +=a+""+ count;
//                }
//            }else{
//                result +=a+""+count;
//                count = 1;
//            }
//        }
//        return result;
//
//    }

        public static void frequencyOfEachChar(String str){

            Map<Character, Integer> counter = new LinkedHashMap<>();

            for(int i = 0; i < str.length(); i++){
                //apple
                //a

                char key = str.charAt(i);//a

                if(counter.containsKey(key)){
                    // the letter/char was found before, this is a duplicate occurrence,
                    // so we will need to update the counter for it, which is the value in our map

                    counter.put(key, counter.get(key) + 1); // counter.get() the method from the map
                    // to get the value of the previous counter, then we add 1 to that number,
                    // then assigns that result as the new value linked to that key

                } else {
                    // the map does not contain the letter/char -> which means this is the first
                    // time the character was found, so we should add it to the map

                    counter.put(key, 1);
                }

            }

            System.out.println(counter);
        }

        public static void main(String[] args) {

            frequencyOfEachChar("banana"); //{b=1, a=3, n=2}
            frequencyOfEachChar("merhabajavaja");

        }

    }
