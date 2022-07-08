package day04;

public class MyIphone {
        String model;
        double price;
        static String company;
        static String os;

        static { //Statik degiskenler icin atamalar yapilir
            System.out.println("STATIC BLOCK RUN");
            company = "Apple";
            os = "IOS";
        }


        public MyIphone(String model, double price) { // Instance variable dan olusturulur. Statik degiskenler dahil olamaz.
            System.out.println("CONSTRUCTOR RUN");
            this.model = model;
            this.price = price;
        }

        @Override
        public String toString() {
            return "MyIPhone{" +
                    "model='" + model + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
