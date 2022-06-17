package day01;

public class Concatenation {

    /*
    	char l1 = 'a';
	char l2 = 'z';
	char l3 = 'g';
	System.out.println(l1+ "" + l2); //az

String degeri olarak atanir.

String a = "ahmet";
String b = "niyazi";
System.out.println(a+b);// ahmetniyazi
System.out.println(a+ " ve " + b);// ahmet ve niyazi

** Onemli noktalar:

- System.out.println(1 +2 + "5" + 2 + 5 );// 3525
""oncekini normal math alir, sonrakiler artik concatination olur.

- Birden varsa:
String + String --> Concatination
String + Number --> Concatination
String + Char --> Concatination
number + number --> Additional (math)
char + char --> ASCII (math)

-Tek olurlarsa:
char --> char
String --> String
int --> int

SHORTCUT: soutv
String name = "Hamza";
System.out.println(" Adiniz: " + name);// Adiniz: Hamza

a.soutv -->  System.out.println("a" + a);

     */

    public static void main(String[] args) {

        char l1 = 'a';
        char l2 = 'z';
        char l3 = 'g';
        System.out.println(l1+ "" + l2); //Unit: String -->""

        String a = "ahmet";
        String b = " niyazi";
        System.out.println(a+b);// ahmetniyazi
        System.out.println(a+ " & " + b);// ahmet ve niyazi


        System.out.println(2+1 + "Sadik" + 1+3); //3Sadik13
        System.out.println(" Sadik " + 3+4); //Unit String
        System.out.println(" Sadik " + (3+4)); // String


    }
}
