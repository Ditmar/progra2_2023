package example;

public class Square extends Shape implements Operations, AnotherOperations {
    private String color;
    private Integer grades;

    public Square(String color, Integer grades) {
        super(color, grades);
        this.color = color;
        this.grades = grades;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getGrades() {
        return grades;
    }

    public void setGrades(Integer grades) {
        this.grades = grades;
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
