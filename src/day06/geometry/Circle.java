package day06.geometry;

//Normal -> Concrete Class
public class Circle extends Shape{
    public double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

//implementation yaparak metodu customize ettik.
    @Override
    public double area() {
        return radius*radius*Math.PI;
    }
}
