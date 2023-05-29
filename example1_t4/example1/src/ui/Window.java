package ui;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import config.Env;
import config.Utils;
import services.StudentServices;
import services.UserServices;
import services.base.Service;
import ui.base.BaseWindows;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.TextField;
import java.io.File;
import java.io.IOException;

public class Window extends BaseWindows {
    private Panel panelLeft;
    private Panel panelRight;
    private UserServices service;

    private JTextField username;
    private JPasswordField password;

    public Window(Service service, String title, Dimension size) {
        super(title, size);
        this.service = (UserServices) service;
        registerEnvGraphs(Env.rootFontPath + "Quicksand-Regular.ttf");
        this.setupUi();
    }

    private void registerEnvGraphs(String path) {
        try {
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT,
                    new File(
                            path)));

        } catch (IOException | FontFormatException e) {
            System.out.println(e);
        }
    }

    public Window(String title) {
        super(title);
        this.setupUi();
    }

    @Override
    public void setupUi() {
        panelLeft = new Panel(new Dimension(600, 500), new Point(0, 0), new Color(196, 223, 223));
        panelRight = new Panel(new Dimension(400, 500), new Point(600, 0), Color.BLUE);
        this.add(panelLeft);
        this.add(panelRight);
        // labels
        setupLabels();
        setupTextFields();
        setupJCombo();
        setupButton();
        setupCheckBox();
        setupImages();
    }

    private void setupImages() {
        Image image = new Image();
        image.setSource(Env.rootImagePath + "bart.png", 200, 300);
        image.setSize(200, 300);
        image.setLocation(Utils.getCenterX(panelRight, image), 150);
        panelLeft.add(image);

    }

    private void setupCheckBox() {
        JCheckBox checkBox = new JCheckBox();
        checkBox.setSize(45, 45);
        checkBox.setFocusable(false);
        checkBox.setBackground(Color.WHITE);
        checkBox.setLocation(Utils.getCenterX(panelRight, checkBox), 270);
        panelRight.add(checkBox);
        JCheckBox checkBox2 = new JCheckBox();
        checkBox2.setSize(45, 45);
        checkBox2.setFocusable(false);
        checkBox2.setBackground(Color.WHITE);
        checkBox2.setLocation(Utils.getCenterX(panelRight, checkBox2) + 40, 270);
        panelRight.add(checkBox2);
    }

    private void setupButton() {
        JButton button = new JButton("Log-in");
        button.setSize(150, 30);
        button.setLocation(Utils.getCenterX(panelRight, button), 260);
        button.setBackground(Color.WHITE);
        button.setForeground(Color.BLUE);
        button.setFocusable(false);
        button.setEnabled(true);
        button.addActionListener((event) -> {
            // call logic of session
            // mock login
            if (this.service.login(this.username.getText(), this.password.getText())) {
                this.close();
                StudentServices studenServices = new StudentServices();
                DashBoard dashBoard = new DashBoard(studenServices, "Dashboard", new Dimension(1000, 500));
                dashBoard.open();
                return;
            }

        });
        Cursor pointer = new Cursor(Cursor.HAND_CURSOR);
        button.setCursor(pointer);

        panelRight.add(button);
    }

    private void setupJCombo() {
        JComboBox<String> combo = new JComboBox<String>();
        combo.addItem("Admin");
        combo.addItem("Vendedor");
        combo.addItem("Usuario");
        combo.setSize(200, 25);
        combo.setLocation(Utils.getCenterX(panelRight, combo), 230);
        combo.setForeground(Color.DARK_GRAY);
        combo.setBackground(Color.WHITE);
        panelRight.add(combo);
    }

    private void setupTextFields() {
        username = new JTextField("Nombre de Usuario");
        username.setSize(260, 40);
        username.setLocation(Utils.getCenterX(panelRight, username), 150);
        username.setForeground(Color.DARK_GRAY);
        username.setBackground(Color.WHITE);
        username.setCaretColor(Color.BLUE);
        panelRight.add(username);

        password = new JPasswordField("Password");
        password.setSize(260, 40);
        password.setLocation(Utils.getCenterX(panelRight, password), 190);
        password.setForeground(Color.DARK_GRAY);
        password.setBackground(Color.WHITE);
        password.setCaretColor(Color.BLUE);
        panelRight.add(password);
    }

    private void setupLabels() {
        JLabel label = new JLabel("Login  de usuario");
        Font mediumFont = new Font("Quicksand", Font.PLAIN, 15);
        label.setFont(mediumFont);
        label.setSize(300, 25);
        label.setLocation(Utils.getCenterX(panelLeft, label), 10);
        // label.setBounds(10, 10, 100, 25);
        label.setForeground(Color.BLACK);
        panelLeft.add(label);

        JLabel label2 = new JLabel("Te ayudamos en todo");
        label2.setSize(150, 25);
        label2.setLocation(Utils.getCenterX(panelRight, label2), 10);
        label2.setForeground(Color.WHITE);
        panelRight.add(label2);

        JLabel label3 = new JLabel("Recibir notificaciones");
        label3.setSize(150, 25);
        label3.setLocation(Utils.getCenterX(panelRight, label3), 300);
        label3.setForeground(Color.WHITE);
        panelRight.add(label3);

    }

}
