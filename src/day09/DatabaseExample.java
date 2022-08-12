package day09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseExample {



        public static void main(String[] args) {

            /*srr: niyazi
            niyazi -> iiyazn
            char first = str.chartAt(0);
            char last = str.charAt(str.lenght()-1);

            String result = last+str.substring(1,str.lenght()-2)) +first;



             */

            System.out.println(swapName("suleymansimseksimsek"));

        /*
            People
                FIRST_NAME: James
                LAST_NAME: Bond
                BATCH: 7
         */

            Map<String, String> map = new HashMap<>();
            map.put("FIRST_NAME", "James");
            map.put("LAST_NAME", "Bond");
            map.put("BATCH", "7");

            System.out.println(map); // {BATCH=7, LAST_NAME=Bond, FIRST_NAME=James}




//List< String >  list of String elements [{map0}, {map1}, {map2} , ...]
            List<Map<String, String>> list = new ArrayList<>();
            list.add(map); // index 0
            list.add(makeMap("Shina", "Alhusaini", "26")); // index 1
            list.add(makeMap("Dzera", "Temiraeva", "20")); // index 2
            list.add(makeMap("Diana", "Bulgac", "19")); // index 3
            list.add(makeMap("Sabrina", "Badirli", "26")); // index 4
            list.add(makeMap("Ali", "Dokumaci", "16")); // index 5

            // how can I check the last name of the map I just added
            System.out.println(list.get(1).get("FIRST_NAME"));  //Shina
            // first get is from the list by index, then we have the get method from map to give the value by the key

            System.out.println(list.get(1).get("LAST_NAME")); // Alhusaini

            System.out.println();
            // Go through the ArrayList of Map elements - the map elements are the information for each person

            for (Map<String, String> each : list) {
                System.out.println(each);
            }

        /*
        [
        {BATCH=7, LAST_NAME=Bond, FIRST_NAME=James}
{BATCH=26, LAST_NAME=Alhusaini, FIRST_NAME=Shina}
{BATCH=20, LAST_NAME=Temiraeva, FIRST_NAME=Dzera}
{BATCH=19, LAST_NAME=Bulgac, FIRST_NAME=Diana}
{BATCH=26, LAST_NAME=Badirli, FIRST_NAME=Sabrina}
{BATCH=16, LAST_NAME=Dokumaci, FIRST_NAME=Ali}
]
         */
            System.out.println();

            // Go through all the people and print all the first names

            for (Map<String, String> each : list) {
                System.out.println(each.get("FIRST_NAME")); // each is each map, the maps are the people's information
            }
/*
James
Shina
Dzera
Diana
Sabrina
Ali
 */
            System.out.println();


            // Find all the people who are in Batch 20 or above

            for (Map<String, String> each : list) {
                if (Integer.parseInt(each.get("BATCH")) >= 20) {
                                        //"7"
                    //Integer.parseInt("7")-> 7 (int cevirir)
                    System.out.println(each.get("FIRST_NAME"));
                }
            }
/*
Shina
Dzera
Sabrina
 */
            System.out.println();

            // Print the information of the last person in my List
            // the first get call is the List method, to get the element based on the index
            // the second get method is from the map, to get the value based on the key
            System.out.println("First name: " + list.get(list.size() - 1).get("FIRST_NAME"));
            System.out.println("Last name: " + list.get(list.size() - 1).get("LAST_NAME"));
            System.out.println("Batch name: " + list.get(list.size() - 1).get("BATCH"));

        /*
        First name: Ali
Last name: Dokumaci
Batch name: 16
         */
        }

            public static Map<String, String> makeMap (String ...values){ //var argument
                                                // (String srtr1, String str2, String str3)
                Map<String, String> map = new HashMap<>();
                map.put("FIRST_NAME", values[0]);
                map.put("LAST_NAME", values[1]);
                map.put("BATCH", values[2]);
                return map;
            }




    public static String swapName(String str){
        String result="";
        char first = str.charAt(0);
        char last = str.charAt(str.length()-1);
        //niyazi

        result = last+str.substring(1,str.length()-1) + first;

        return result;
    }

        }
