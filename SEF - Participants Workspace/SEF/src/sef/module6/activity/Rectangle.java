package sef.module6.activity;

public class Rectangle extends Shape{
    private double length;
    private double breadth;
    private String color;
    Rectangle(){
        length = 0;
        breadth = 0;
    }
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double calculateArea() {
        double area = length * breadth;
        return area;
    }
    public double calculatePerimeter() {
        double perimeter = 2 * (length + breadth);
        return perimeter;
    }

}


