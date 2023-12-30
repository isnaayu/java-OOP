package main;

import childs.Circle;
import childs.Triangle;
import parents.Shape;

public class App {
    public static void main(String[] args) {
        //TODO
        Shape lingkaran = new Circle("Red", 25);
        Shape segitiga = new Triangle(25, 20, "Blue");
        
        System.out.println("Luas Lingkaran Berwarna "+lingkaran.getColor()+ " adalah "+lingkaran.getArea());
        System.out.println("Luas Segitiga berwarna "+segitiga.getColor()+" adalah "+segitiga.getArea());
    }
}
