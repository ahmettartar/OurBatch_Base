package day06.geometry;

public class Rectangular extends Shape{
    public double width;
    public double length;

    public Rectangular(String name, double width, double length) {
        super(name);
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width*length;
    }

}
