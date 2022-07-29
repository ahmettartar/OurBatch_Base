package day07;

public class ExceptionMath {
    public static void main(String[] args) throws InterruptedException {


        int a = 6;
        int b = 0;
       // System.out.println("Sonuc= " +a/b); //ArithmeticException

        try {

            System.out.println("Sonuc= " +a/b); //ArithmeticException

        }catch (ArithmeticException m){
            System.out.println(m.getMessage());

        }catch (IndexOutOfBoundsException k){
            System.out.println(k.getMessage());

        }catch (Exception e){
            System.out.println(e.getMessage());

        }

        System.out.println("hatadan sonra program akisi devam etti.");


        System.out.println("===========");
        try {
            Thread.sleep(-1000); //programi 3sn durduruyor.
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finaly block her zaman calisir.");
        }

        System.out.println("thread sonrayi yazi...");


        // Method signature
        Thread.sleep(2000);
        // 1- try/catch
        // 2- method signature'a hata turunu throws HATATURU yapariz.

        // Manual throw exception
        // Satir icinde kullanilinca manual olarak hatayi belirtilir
        // thow new HATATURU("mesaji yazin")
        if (false){
            throw new ArithmeticException("Aritmetik hata olustu");
        }else{
            throw new NullPointerException("Null hatasi olustu");
        }

    }
}
