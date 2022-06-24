package day02;

public class ForLoop {
    public static void main(String[] args) {

        int num =0;
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Hello " + i );

            System.out.println(num);
            num++;
        }

        for (int i = 10; i >=0 ; i--) {
            System.out.println(i);

        }

//*************************
        num=0;
        while (num<=5){
            System.out.println("Hello"); //infinite loop
            num++;//iteration unutmamak lazim to avoid the infinite loop
        }


        //*************************
        num=5;
        do{
            System.out.println("Merhaba");
            //num++;

        }while (num++<10);



    }

    //NOT
    /**
     * Iterasyon sayisi biliniyorsa For Loop
     * Bilinmiyorsa while veya do-while kullanilir.
     */
}
