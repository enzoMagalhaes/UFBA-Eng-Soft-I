package aberto_fechado;


//      The Open-Closed Principle states that software entities (classes, modules, functions, etc.) should be open for extension 
//      but closed for modification. In other words, you should be able to extend the behavior of a system without modifying its 
//      existing code.
//

//
//      Let's consider a scenario where you have a Shape class hierarchy that includes various shapes like Circle, Rectangle, and Triangle. 
//      Each shape has a method called calculateArea() that calculates its area. Initially, you have the following implementation:
//


abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return (base * height) / 2;
    }
}



//      Now, imagine you need to introduce a new shape called Square that extends Shape and calculates its area based on its side length. 
//      According to the Open-Closed Principle, you should be able to add this new shape without modifying the existing code.


//      Here's an example of how you can achieve this while adhering to the Open-Closed Principle in Java:

class Square extends Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double calculateArea() {
        return sideLength * sideLength;
    }
}

//      By creating a new class Square that extends Shape and implements its calculateArea() method, you can introduce the new functionality 
//      without modifying the existing Shape hierarchy.


//      This adherence to the Open-Closed Principle allows you to extend the system's behavior by adding new shapes or modifying existing ones 
//      without having to change the code that uses these shapes or the existing shape classes themselves. The existing code that depends on the 
//      Shape hierarchy can remain untouched, and you can introduce new functionality by extending the system in a modular and reusable manner.