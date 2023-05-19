package shape;

public class Square extends Shape {
    private Double edge;

    public Square(String color, Double edge) {
        super(color);
        this.edge = edge;
    }

    @Override
    public Double area() {
        System.out.println(this.getColor());
        return this.edge * this.edge;
    }

}
