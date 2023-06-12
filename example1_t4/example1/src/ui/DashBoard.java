package ui;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.plaf.ListUI;
import javax.swing.table.DefaultTableModel;

import config.Utils;
import dto.Student;
import services.StudentServices;
import services.base.Service;
import ui.base.BaseWindows;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;

public class DashBoard extends BaseWindows {
    private JPanel leftSideContent;
    private JPanel rightSideContent;
    StudentServices studentServices = new StudentServices();
    private DefaultTableModel model;

    public DashBoard(Service service, String title, Dimension size) {
        super(title, size);
        this.studentServices = (StudentServices) service;
        this.setupUi();
    }

    @Override
    public void setupUi() {
        leftSideContent = new Panel(new Dimension(200, 500), new Point(0, 0), new Color(196, 223, 223));
        rightSideContent = new Panel(new Dimension(800, 500), new Point(200, 0), Color.BLUE);
        this.add(leftSideContent);
        this.add(rightSideContent);
        setUpJTable();
        setUpJList();

    }

    private void setUpJTable() {
        // String[][] data = {
        // { "SIS-211", "TECNICAS DE PROGRAMACION", "40" },
        // { "SIS-101", "CALCULO 1", "40" },
        // { "SIS-205", "FISICA 1", "40" },
        // };
        String[] columnNames = { "ID", "Nombre", "horas" };
        model = new DefaultTableModel(columnNames, 0);
        JTable jtable = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(jtable);
        scrollPane.setLocation(300, 0);
        scrollPane.setSize(new Dimension(300, 500));
        rightSideContent.add(scrollPane);
    }

    private void addData(String[] data) {
        model.addRow(data);
    }

    private void setUpJList() {
        // load services
        ArrayList<Student> list = this.studentServices.getStudents(40);
        String[] dataList = Utils.convertListCode(list);
        JList listUi = new JList<String>(dataList);
        listUi.setSize(300, 500);
        // rightSideContent.add(listUi);
        JScrollPane scroll = new JScrollPane();
        scroll.setSize(new Dimension(300, 500));
        scroll.getViewport().add(listUi);
        rightSideContent.add(scroll);
        listUi.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String selectedValue = (String) listUi.getSelectedValue();
                if (selectedValue != null) {
                    Student student = this.studentServices.searchStudent(selectedValue);
                    System.out.println(student.getName());
                }
            }
        });
        // String[] data = { "SIS-101", "CALCULO 1", "40" };
        // addData(data);

    }
}
