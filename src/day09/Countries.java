package day09;

import java.util.*;

public class Countries {
        public static void main(String[] args) {
            //ULKE: Sehir1, Sehir2.,,

            Map<String, ArrayList<String>> countries = new HashMap<>();
            // created a HashMap that has key of String type - countries and ArrayList<String> for the value and those will be cities

            ArrayList<String> usCities = new ArrayList<>(Arrays.asList("Chicago", "New York", "Dallas", "DC", "Denver", "LA"));
            countries.put("United States", usCities);
            countries.put("Turkey", new ArrayList<>(Arrays.asList(
                    "Istanbul", "Ankara", "Izmir"
            )));
            countries.put("Canada", new ArrayList<>(Arrays.asList(
                    "Quebec", "Toronto", "Vancouver"
            )));

            System.out.println(countries);
            //{Canada=[Quebec, Toronto, Vancouver], Turkey=[Istanbul, Ankara, Izmir],
            // United States=[Chicago, New York, Dallas, DC, Denver, LA]}

            //SHORTCUT: iter

            // Print all cities that start with D or I

            for (ArrayList<String> cities : countries.values()) { // iterates through the values of the map, which are the ArrayList of cities
            /*System.out.println(cities);
            [Quebec, Toronto, Vancouver]
            [Istanbul, Ankara, Izmir]
            [Chicago, New York, Dallas, DC, Denver, LA]

             */
                for (String each : cities) { // iterates through each city in each ArrayList value

                    if (each.startsWith("D") || each.startsWith("I")) {
                        System.out.println(each);
                    }

                }

            }

            System.out.println();
            System.out.println("What Country do you want to tour?");
            Scanner input = new Scanner(System.in);
            String country = input.nextLine();

            for(String cities : countries.get(country)){// value`lari sehirleri String verir
                System.out.println("Touring..." + cities);
            }


        }
    }
