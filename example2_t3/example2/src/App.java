import process.Circle;
import process.Rectangle;
import process.Process;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Example 2");
        Circle circle = new Circle(10, "greed");
        Rectangle rectangle = new Rectangle(10, 15);
        polimorfismo(rectangle);
        polimorfismo(circle);
    }

    public static void polimorfismo(Process item) {
        item.print();
        item.increment(20);
        item.print();
        item.increment(10);
        item.print();
    }
}
