package day07.exception;

public class DenemeHata {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        try{
            System.out.println(a[10]);
        }catch (HataVerir e){
            System.out.println(e.getMessage());
        }

        System.out.println("Hata sonrasi satir.");


    }


}
