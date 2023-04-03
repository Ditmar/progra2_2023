package university.grades;

import java.util.Date;

public class Grades {
    private Integer grade;
    private Date date;

    public Grades() {
        this.grade = 34;
        this.date = null;
        System.out.println("Hola soy grades");
    }
    
    public Integer calcGrades() {
        return null;
    }
    public void setGrade(Integer grade) {

        this.grade = grade;
    }

    public Integer getGrades() {
        return this.grade;
    }
}
