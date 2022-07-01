package day03;

public class MethodWithReturn {

    public static void main(String[] args) {

        System.out.println("toplama(5,6) = " + toplama(5, 6)); //Argument
        int sonuc = toplama(4,9);
        System.out.println(sonuc);

        System.out.println("birlestir(\"merhaba\", \"yeni dunya\") = " + birlestir("merhaba", "yeni dunya"));


        System.out.println("birlestir2(\"Merhaba \", \" Suleyman\") = " + birlestir2("Merhaba ", " Suleyman"));


        System.out.println("========================");
        CustomMethodPractice.selamlama();

    }

    public static int toplama(int num1, int num2 ){ // result = a+b

        int result= num1+num2;


        return result;
        //
       //System.out.println("ABC");

    }

    public static int birlestir(String str1, String str2 ){

        String a = str1+str2;
        // 2.YOL
        String b= str1.concat(str2);//str1+str2

        //int boy = a.length();
        //veya

        //return boy;
        //return a.length();
        return (str1+str2).length();
        //
        //System.out.println("ABC");

    }

    public static String birlestir2(String str1, String str2 ){

        return str1+str2;

    }

}
