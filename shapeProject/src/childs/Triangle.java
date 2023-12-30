package childs;

import parents.Shape;

public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(){
        // TODO
    }

    public Triangle(double base, double height, String color){
        setColor(color);
        this.base = base;
        this.height = height;
    }

    // Override dan Implementasi Method getArea()
    public double getArea(){
        double area = 0.5 * height * base;
        return area;
    }
}
