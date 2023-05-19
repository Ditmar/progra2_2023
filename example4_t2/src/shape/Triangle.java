package shape;

public class Triangle extends Shape {
    private Double base;
    private Double height;

    public Triangle(String color, Double base, Double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public Double area() {
        System.out.println(this.getColor());
        return this.height * this.base / 2;
    }
}
