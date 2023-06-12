package config;

import java.awt.Color;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JComponent;

import dto.Student;

public class Utils {
    public static Integer WIDTH = 300;
    public static Integer HEIGHT = 300;
    public static Integer X = 0;
    public static Integer Y = 0;
    public static Color COLOR = Color.BLUE;

    public static Integer getCenterX(JComponent container, JComponent child) {
        return (container.getSize().width - child.getSize().width) / 2;
    }

    public static Integer getCenterY(JComponent container, JComponent child) {
        return (container.getSize().height - child.getSize().height) / 2;
    }

    public static String[] convertList(ArrayList<Student> student) {
        String[] names = new String[student.size()];

        for (Integer i = 0; i < student.size(); i++) {
            Student item = student.get(i);
            names[i] = item.getName() + " " + item.getLastname();
        }
        return names;
    }

    public static String[] convertListCode(ArrayList<Student> student) {
        String[] names = new String[student.size()];

        for (Integer i = 0; i < student.size(); i++) {
            Student item = student.get(i);
            names[i] = item.getCi();
        }
        return names;
    }
}
