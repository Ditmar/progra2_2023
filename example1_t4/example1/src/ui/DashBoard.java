package ui;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.plaf.ListUI;

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
        setUpJList();
    }

    private void setUpJList() {
        // load services
        ArrayList<Student> list = this.studentServices.getStudents(20);
        String[] dataList = Utils.convertList(list);
        JList listUi = new JList<String>(dataList);
        listUi.setSize(300, 500);
        rightSideContent.add(listUi);
    }
}
