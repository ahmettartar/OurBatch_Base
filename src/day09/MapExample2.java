package day09;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {

    public static void main(String[] args) {

        /*
        KEY     VALUE
        Marka: Toyota -> String: String
        model: Camry  -> String: String
        price: 30000.99  -> String: Double
        color: black    -> String: String
        seat: 5         -> String: int
         */

        // Object class: The parent of all objects.

        Map<String, Object> car = new HashMap<>();
        //Map<String, ?> car = new HashMap<>();
        car.put("Marka", "Toyota");
        car.put("Model", "Camry");
        car.put("Price", 30000.0);
        car.put("Color", "Black");
        car.put("Seat", 5);

        System.out.println(car); //random order.






    }
}
