import java.util.ArrayList;

import animal.Animal;
import animal.Bird;
import animal.Dog;
import animal.Fish;
import shape.Circle;
import shape.Shape;
import shape.Square;
import shape.Triangle;

public class App {
    public static void main(String[] args) throws Exception {
        // Triangle triangle = new Triangle("triangle", 20.0, 10.0);
        // Circle circle = new Circle("circle", 34.3);
        // Square square = new Square("square", 56.2);
        // // ArrayList<Shape> list = new ArrayList<>();
        // list.add(triangle);
        // list.add(circle);
        // list.add(square);
        // print(circle);
        // print(triangle);
        // print(square);
        Bird bird = new Bird("Pajaro loco");
        Dog dog = new Dog("Perro Brian");
        Fish fish = new Fish("Yes fish");
        print(bird);
        print(fish);
        print(dog);
    }

    public static void print(Animal animal) {
        animal.eat();
        animal.move();
    }
    // public static void print(Shape shape) {
    // shape.area();
    // }
}
