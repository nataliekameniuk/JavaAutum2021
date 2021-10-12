package sef.module6.activity;

public class AbstractionActivity {
    public static void main (String[] args){
        Shape square = new Square(5);
        Shape rectangle = new Rectangle(5,6);
        rectangle.setColor("green");
        System.out.println("--print the information for square-");
        System.out.println("area of square " + square.calculateArea());
        System.out.println("area of perimeter " + square.calculatePerimeter());
        System.out.println("--print the information for rectangle-");
        System.out.println("area of rectangle " + rectangle.calculateArea());
        System.out.println("perimeter of rectangle " + rectangle.calculatePerimeter());
        System.out.println("rectangle color " + rectangle.color);
    }
}
