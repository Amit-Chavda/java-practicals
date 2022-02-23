class Shape {
    void draw() {
        System.out.println("I'm Shape");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("I'm Rectangle");
    }
}

public class OverridingExample {
    public static void main(String args[]) {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        Shape shape = new Shape();
        shape.draw();

        shape = rectangle;
        shape.draw();
    }
}