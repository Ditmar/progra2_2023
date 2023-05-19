
import math.BinaryOperations;
import math.Vector;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Overload Example!");
        BinaryOperations binary = new BinaryOperations();
        Integer result = binary.plus(49, 50);
        Vector vectorResults = binary.plus(new Vector(2, 3), new Vector(5, 8));
        System.out.println(result);

        vectorResults.print();
    }
}