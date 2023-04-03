package grades;

import java.util.ArrayList;

public class ManagementGrades {
    private ArrayList<Double> grades;
    public ManagementGrades() {
        grades = new ArrayList<>();
    }
    public void addGrade(Double grade) {
        this.grades.add(grade);
    }
    public void showGrades () {
        for (Double grades : this.grades) {
            System.out.println(grades);
        }
    }
    public ArrayList<Double> getListGrades() {
        return this.grades;
    }
    public void showApproved() {
        for (Double grades : this.grades) {
            if (grades > 51) {
                System.out.println(grades);
            }
        }
    }
}