package day04;

public class Address {

    String street;
    String city;
    String state;
    String zipcode;

// public Address(String inputStreet, String inputCity, String inputState, String
   // inputZipcode){
// street = inputStreet;
// city = inputCity;
// state = inputState;
// zipcode = inputZipcode;
// }
    public Address(String street, String city, String state, String zipcode){
//ayni isimleri local variableslarda kullandik.
//artik her instance variable cagrildiginda artik burdaki degerleri alir.
            this.street = street; // assigning the value of the local street from the
                                        //parameters to the instance variable street
            this.city = city;
            this.state = state;
            this.zipcode = zipcode;
    }

    public Address(){

    }


    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
