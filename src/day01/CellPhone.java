package day01;

public class CellPhone {

    public static void main(String[] args) {
        String brand = "apple";
        String model = "iphone12";
        String color = "black";
        double price = 1000.99;
        int storage = 128;
        boolean camera = true;
        char sim = 'A';
//WE add a sentence
        System.out.println("I have an " + model + " from " + brand);//I have an iphone12 from apple
        System.out.println("It came in the color " + color + " and It has "
                + storage + "GB");//It came in the color black and It has 128GB
        System.out.println("For the sim type " + sim + " with a camera (" +
                camera + ") the total price was $" + price);
        //For the sim type A with a camera (true) the total price was $1000.99
// approach 2 with one string variable

        String fullMessage = "\nI have an " + model + " from " + brand +
                "\nIt came in the color " + color +
                " and it has " + storage + "GB \nFor the sim type" + sim + " with a camera" + camera +
                " the total price was $" + price;

        /*
        I have an iphone12 from apple
        It came in the color black and it has 128GB
        For the sim typeA with a cameratrue the total price was $1000.99
         */

        System.out.println(fullMessage);


    }
}

