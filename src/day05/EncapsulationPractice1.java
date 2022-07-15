package day05;

public class EncapsulationPractice1 {
//Pen Class
        private String brand; //default
        private String color;
        private boolean hasEraser;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasEraser() {
        return hasEraser;
    }

    public void setHasEraser(boolean hasEraser) {
        this.hasEraser = hasEraser;
    }

    @Override
    public String toString() {
        return "EncapsulationPractice1{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", hasEraser=" + hasEraser +
                '}';
    }
}
