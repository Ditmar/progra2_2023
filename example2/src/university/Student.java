package university;

import java.util.Date;


class Student {
    private String name;
    private String lastname;
    private String ci;
    private Integer age;
    private Date borndDate;
    public Student(String name, String lastname, String ci, Integer age) {
        this.name = name;
        this.lastname = lastname;
        this.ci = ci;
        this.age = age;
        this.borndDate = null;
    }

    public void setName (String name) {
        this.name = name;
    }
    public String getName () {
        return this.name;
    }
    public void setLastName (String lastName) {
        this.lastname = lastName;
    }

    public String getLastName () {
        return this.lastname; 
    }

    public void setCi (String ci) {
        this.ci = ci;
    }
    public String getCi () {
        return this.ci;
    }
    public void setBorndDate (Date date) {
        this.borndDate = date;
    }
    public Date getBorndDate() {
        return this.borndDate;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge () {
        return this.age;
    }
}