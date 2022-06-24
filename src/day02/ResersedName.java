package day02;

public class ResersedName {

    public static void main(String[] args) {

        String name = "Niyazi";
        System.out.println(name.substring(0, 1));
        System.out.println(name.substring(5, 6));// index 5 var sadece. 6 index islem icin var.
        //6.index no complain
        String reversed = "";
        String reversed1 = "";
        for (int i = name.length()-1; i >=0; i--) {
            reversed += name.charAt(i);
            reversed1 += name.substring(i, i+1);

        }
        System.out.println("Reversed Name: " + reversed);
        System.out.println("reversed1 = " + reversed1);


    }
}
