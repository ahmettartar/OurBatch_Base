package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        Function<String[], List<String>> yaziCevir = each->{
            List<String> strList = new ArrayList<>();
            for (String s : each) {
                strList.add(s);

            }
            return strList;
        };

        String[] a = {"Ali", "123", "Mehmet", "Austin"};
        List<String> listem = yaziCevir.apply(a);
        System.out.println(listem);
        System.out.println(listem.get(2));


    }
}
