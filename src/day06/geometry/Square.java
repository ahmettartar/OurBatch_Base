package day06.geometry;

public class Square extends Shape{
    public double length;

    public Square(String name, double length) {
        super(name);
        this.length = length;
    }

    @Override
    public double area() {
        return length*length;
    }
}
