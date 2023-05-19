import example.AnotherOperations;
import example.Shape;
import example.Square;
import example.Triangle;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("test polimorfismo");
        Triangle triangle = new Triangle("green", 0);
        Square square = new Square("red", 0);

        triangle.rollout(60);
        square.rollout(30);
        polymorphism(square);
        polymorphism(triangle);
    }

    public static void polymorphism(AnotherOperations shape) {
        shape.print();
    }
}
