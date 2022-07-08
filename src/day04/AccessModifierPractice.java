package day04;

public class AccessModifierPractice {
        public String name = "Ahmet"; //her yerden ulasilabilir
        protected int age = 10; //sadece paket icinde veya sub class'larda
        private String okul = "ABC"; //sadece bu class icinde kullanabiliriz
        double maas = 100.50; // defaul : Paket icinde kullanilabilir
}
