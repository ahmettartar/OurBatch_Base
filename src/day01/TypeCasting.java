package day01;

public class TypeCasting {
    /*
    order: byte short int long float double (Lowest rank to highest rank)

------> Widening
<------ Narrowing

Ex:
	long num = 1;
	int num2 = num; // INCORRECT  (int<long)
	So,
	int num2 = (int) num;  // works: EXPLICITLY/Manually


	OR
	short a = 5;
	int b = a; // works (int>short) IMPLICITLY/Automatically

	Buyuk datatype, kucuk datatype aktarilamaz.
	Lakin, kucuk olan, herzaman buyuk olana aktarilabilir.

DATA LOSS:

	double a = 25.6;
	int b = (int)a; // 25
	Datatype secimine dikkat edilmelidir.
     */

    public static void main(String[] args) {

        long num = 18;
        //int num2 = num; // INCORRECT  (int<long)
        //So,
        int num3 = (int) num;  // works: EXPLICITLY/Manually

        short a = 5;
        int b = a; // works (int>short) IMPLICITLY/Automatically


    }
}
