package example;

public class Triangle extends Shape implements AnotherOperations, Operations {
    public Triangle(String color, Integer grades) {
        super(color, grades);
    }

    @Override
    public void print() {
        System.out.println(getColor());
        System.out.println("Grados " + this.getGrades());
    }

    @Override
    public void rollout(Integer grades) {
        setGrades(this.getGrades() + grades);
    }

    @Override
    public Boolean invert() {
        setGrades(this.getGrades() + 180);
        return true;
    }
}
