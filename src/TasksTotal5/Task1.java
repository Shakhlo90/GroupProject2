package TasksTotal5;

interface Shape {
    void calculateArea();

    void calculatePerimeter();

}

public class Task1 {
    /* Create an Interface 'Shape' with undefined
        methods as calculateArea and
        calculatePerimiter. Create 2 classes Circle &
        Square that implements functionality defined in
        the Shape Interface. Test your code.*/
    public static void main(String[] args) {
        Shape[] arr = {new Circle(5), new Square(6, 8)};

        for (Shape arr1 : arr) {
            arr1.calculateArea();
            arr1.calculatePerimeter();
        }
    }
}

class Circle implements Shape {


    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double circleArea = radius * radius * Math.PI;
        System.out.println("The area of the circle is :" + circleArea);
    }


    public void calculatePerimeter() {
        double P = 2 * Math.PI * radius;
        System.out.println("Perimeter of circle :" + P);
    }

}

class Square implements Shape {
    double lenght;
    double width;

    public Square(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;

    }

    public void calculateArea() {

        System.out.println("The area of the Square is :" + lenght * width);
    }

    public void calculatePerimeter() {
        double sp;
        sp = 2 * (width * lenght);
        System.out.println("Perimeter of Square is : " + sp);
    }

}
