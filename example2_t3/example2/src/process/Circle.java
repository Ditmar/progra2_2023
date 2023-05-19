package process;

public class Circle implements Process {
    private Integer radio;
    private String color;

    public Circle(Integer radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("The radio is " + this.radio + " the color is " + this.color);
    }

    @Override
    public void increment(Integer incrementVar) {
        this.radio += incrementVar;
    }

}
