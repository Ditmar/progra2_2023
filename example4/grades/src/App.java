import java.lang.management.ManagementFactory;
import java.util.Scanner;

import grades.ManagementGrades;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        ManagementGrades grades = new ManagementGrades();
        String option = null;
        // TODO: improve the code quality later
        do {
            printMenu();
            option = read.nextLine();
            Integer optionInteger = Integer.parseInt(option);
            switch (optionInteger) {
                case 1: {
                    String grade = read.nextLine();
                    Double gradeDouble = Double.parseDouble(grade);
                    grades.addGrade(gradeDouble);
                    break;
                }
                case 2: {
                    grades.showGrades();
                    break;
                }
                case 3: {
                    grades.showApproved();
                    break;
                }
                default: {
                    // handler Error;   
                }
            }

        } while (!option.equals("4"));
        read.close();
    }
    public static void printMenu() {
        System.out.println("1. Agregar Nota");
        System.out.println("2. Ver Nota");
        System.out.println("3. Ver Aprobados");
        System.out.println("4. Salir");
    }
}
