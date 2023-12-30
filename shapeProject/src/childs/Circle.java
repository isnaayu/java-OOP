package childs;

import parents.Shape;

public class Circle extends Shape {
    private double radius;
    public Circle(){
        // TODO
    }

    public Circle(String color, double radius){
        setColor(color);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(){
        this.radius = radius;
    }

    // Override dan implementasi method abstrak pada Class Circle
    public double getArea(){
        double area = Math.PI * radius * radius;
        return area;
    }
}
