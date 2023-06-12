package services;

import java.util.ArrayList;
import java.util.HashMap;

import dto.Student;
import dto.Subject;
import services.base.Service;

public class StudentServices implements Service {
    HashMap<String, Student> students = new HashMap<>();

    public Student searchStudent(String ci) {
        return students.get(ci);
    }

    public Subject getSubject(String key) {
        HashMap<String, Subject> hash = new HashMap<>();
        Subject subject1 = new Subject();
        subject1.setCode("SIS-211");
        subject1.setName("Tecnicas de programacion 2");
        subject1.setHours("40");
        hash.put("SIS-211", subject1);

        Subject subject2 = new Subject();
        subject2.setCode("MAT-101");
        subject2.setName("Calculo 1");
        subject2.setHours("40");
        hash.put("MAT-101", subject1);

        Subject subject3 = new Subject();
        subject3.setCode("FIS-205");
        subject3.setName("Fisica 1");
        subject3.setHours("40");
        hash.put("FIS-205", subject1);
        return hash.get(key);
    }

    public ArrayList<Student> getStudents(Integer limit) {
        // algorimo loco
        ArrayList<Student> listStudent = new ArrayList<>();
        String[] codeSubjects = { "SIS-211", "MAT-101", "FIS-205" };
        String[] names = { "Pablo", "Alfredo", "Maria", "Luciana", "Jenny", "Coby", "Arthas", "Socrates" };
        String[] lastnames = { "Lopez", "Mamani", "Luza", "Lupa", "Castillo", "Vargas" };
        Integer j = 5;
        for (Integer i = 0; i < limit; i++) {
            Student student = new Student();
            String name = names[j % names.length];
            String lastname = lastnames[i % lastnames.length];
            Integer ci = 15523300 + i;
            student.setCi(ci.toString());
            student.setName(name);
            student.setLastname(lastname);
            listStudent.add(student);
            Integer len = (int) (Math.ceil(Math.random() * 2));
            for (Integer k = 0; k < len; k++) {
                Subject subject = getSubject(codeSubjects[k]);
                Subject newSubject = new Subject();
                newSubject.setCode(subject.getCode());
                newSubject.setHours(subject.getHours());
                newSubject.setName(subject.getName());
                student.addSubject(newSubject);
            }
            students.put(ci.toString(), student);
            j++;
        }

        return listStudent;
    }

}
