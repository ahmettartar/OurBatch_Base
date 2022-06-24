package day02;

public class ForEach {
    public static void main(String[] args) {

        int[] num1 = {2,56,200,-30,54,9,34};

        for (int i = 0; i <num1.length ; i++) {
            System.out.println(num1[i]);

        }

        //for each loop
        for (int e:num1) {
            //herbir elaman : iterasyon elemani
            System.out.println(e);

        }


    }
}
