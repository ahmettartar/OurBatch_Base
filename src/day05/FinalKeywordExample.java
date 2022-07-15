package day05;

public class FinalKeywordExample {
    public static void main(String[] args) {
        child cocuk1 = new child("Ayse");
        System.out.println("cocuk1 = " + cocuk1);

        parent parent = new parent("ali");


    }


}

class parent {
    final String name;

    public parent(String name) {
        this.name = name;
    }

    public void isim(){
        System.out.println("benim adim :" + name);
    }

    @Override
    public String toString() {
        return "parent{" +
                "name='" + name + '\'' +
                '}';
    }
}

class child extends parent{
    public child(String name) {
        super(name);
    }

    @Override
    public void isim() {
        System.out.println(" Cocuk alani");;
    }

    @Override
    public String toString() {
        return "child{}"+ name;
    }
}

