package process;

public class Rectangle implements Process {
    private Integer height;
    private Integer width;

    public Rectangle(Integer width, Integer height) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void print() {
        System.out.println(
                "The heght of the rectangle is " + this.height + " and the width of the rectange is " + this.width);
    }

    @Override
    public void increment(Integer incrementVar) {
        this.height += incrementVar;
        this.width += incrementVar;
    }

}
