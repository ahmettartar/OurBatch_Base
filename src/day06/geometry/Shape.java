package day06.geometry;

public abstract class Shape {
    public String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area();
}
