package services;

import java.util.ArrayList;

import dto.Student;
import services.base.Service;

public class StudentServices implements Service {

    public ArrayList<Student> getStudents(Integer limit) {
        // algorimo loco
        ArrayList<Student> listStudent = new ArrayList<>();
        String[] names = { "Pablo", "Alfredo", "Maria", "Luciana", "Jenny", "Coby", "Arthas", "Socrates" };
        String[] lastnames = { "Lopez", "Mamani", "Luza", "Lupa", "Castillo", "Vargas" };
        Integer j = 5;
        for (Integer i = 0; i < limit; i++) {
            Student student = new Student();
            String name = names[j % names.length];
            String lastname = lastnames[i % lastnames.length];
            student.setName(name);
            student.setLastname(lastname);
            listStudent.add(student);
            j++;
        }
        return listStudent;
    }

}
