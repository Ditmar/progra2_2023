package dto;

import java.util.ArrayList;

public class Student {
    private String name;
    private String lastname;
    private Integer age;
    private String ci;
    private ArrayList<Subject> subjects;

    public Student() {
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

}
