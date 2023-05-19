package shape;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract Double area();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
