package day04;

public class Food {

    String sebze;
    String icecek;
    int kilo;


    public Food(String sebze){
        this.sebze = sebze;
    }

//    public Food(String sebze, String icecek){
//        this.sebze = sebze;
//        this.icecek = icecek;
//    }
        public Food(String sebze, String icecek){
        //this.sebze = sebze;
        this(sebze); //Consructor chaining
        this.icecek = icecek;
    }

    public Food(String sebze, String icecek, int kilo){
//        this.sebze = sebze;
//        this.icecek = icecek;
        this(sebze, icecek); // ilk sirada kullanilmasi gerekir (MUST)
        this.kilo = kilo;

    }




//    public Food(){
//
//    }


    @Override
    public String toString() {
        return "Food{" +
                "sebze='" + sebze + '\'' +
                ", icecek='" + icecek + '\'' +
                ", kilo=" + kilo +
                '}';
    }
}
