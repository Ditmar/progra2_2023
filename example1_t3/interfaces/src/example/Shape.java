package example;

public class Shape {
    private String color;
    private Integer grades;

    public Shape(String color, Integer grades) {
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

}
