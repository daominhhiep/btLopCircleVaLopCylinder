package cylinder;

import circle.Circle;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getVolume(){
        return super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "A Cylinder with volume = "
                + getVolume()
                + " and color of "
                + super.getColor();
    }
}
