package shape;

public class Circle extends Shape {
    private Double radius;

    public Circle(String color, Double radius) {
        super(color);
        this.radius = radius;
        // TODO Auto-generated constructor stub
    }

    @Override
    public Double area() {
        System.out.println(this.getColor());
        return Math.PI * this.radius * this.radius;
    }

}
