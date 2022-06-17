package day01;

public class UnaryOperator {
    /*
    Ex:
	int age = 20;
	System.out.println(age++);//20 		POST INCREMENT
	System.out.println(age);//21

	System.out.println(++age);//22 		PRE INCREMENT
	System.out.println(age);//22

Ex:
	int age = 10;
	System.out.println(age--);//10 		POST DECREMENT
	System.out.println(age);//9

	System.out.println(--age);//8		PRE DECREMENT
	System.out.println(age);//8
     */

    public static void main(String[] args) {
        int age = 20;
        System.out.println(age++);//20 		POST INCREMENT--> in memory: age= age+1 20+1=21
        System.out.println(age);//21

        System.out.println(++age);//22 		PRE INCREMENT
        System.out.println(age);//22

        int age1 = 10;// 9 8
        System.out.println(age1--);//10 		POST DECREMENT
        System.out.println(age1);//9

        System.out.println(--age1);//8		PRE DECREMENT
        System.out.println(age1);//8

        int a = 20;// 19 20 19 18
        int b = -a-- + a++ + --a * a--; //360
              //-20  + 19  +  19 * 19
            // -20 + 19 + 361


        int R = 20;
        int w = -R-- + -R++ + --R * R-- % 2; //-38
        //More practice..

    }

}
