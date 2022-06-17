package day01;

import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        int score = input.nextInt();
        int score = 75;
        if (score >= 75){
            System.out.println("Passed"); //if block
        }else{
            System.out.println("Fail"); //else block
        }

//else if
        if (score >= 90){
            System.out.println("AA"); //if block
        }else if(score<90 && score>=80){
            System.out.println("BB"); //else block
        }else if(score<80 && score>=70){
            System.out.println("CC");
        }else{
            System.out.println("FF");
        }



    }
}
