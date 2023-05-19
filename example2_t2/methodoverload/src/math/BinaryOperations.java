package math;

public class BinaryOperations {
    public BinaryOperations() {

    }

    public Integer plus(Integer a, Integer b) {
        return a + b;
    }

    public Integer substrac(Integer a, Integer b) {
        return a - b;
    }

    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    public Integer divide(Integer a, Integer b) {
        return a / b;
    }

    // sobrecarga de metodos
    // method overload
    public Vector plus(Vector a, Vector b) {
        return new Vector(a.getX() + b.getX(), a.getY() + b.getY());
    }

    public Vector substrac(Vector a, Vector b) {
        return new Vector(a.getX() - b.getX(), a.getY() - b.getY());
    }

    public Vector multiply(Integer r, Vector a) {
        return new Vector(r * a.getX(), r * a.getY());
    }

}
