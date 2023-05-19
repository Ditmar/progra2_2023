package ui;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

public class Window extends JFrame {
    public Window(String title, Dimension size) {
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // cierra el hilo de procesamiento cuando la ventana es cerrada
        this.setSize(size);
        this.setLocationRelativeTo(this);
        setLayout(null);
        this.setupUi();
    }

    public Window(String title) {
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // cierra el hilo de procesamiento cuando la ventana es cerrada
        this.setSize(new Dimension(WIDTH, HEIGHT));
        this.setLocationRelativeTo(this);
        setLayout(null);
        this.setupUi();
    }

    private void setupUi() {
        Panel panelLeft = new Panel(new Dimension(600, 500), new Point(0, 0), new Color(196, 223, 223));
        Panel panelRight = new Panel(new Dimension(400, 500), new Point(600, 0), Color.BLUE);
        this.add(panelLeft);
        this.add(panelRight);
        // labels
        JLabel label = new JLabel("Hola mundo");
        label.setSize(100, 25);
        label.setLocation((panelLeft.getSize().width - label.getSize().width) / 2, 10);
        // label.setBounds(10, 10, 100, 25);
        label.setForeground(Color.BLACK);
        panelLeft.add(label);
    }

    public void open() {
        this.setVisible(true);
    }

    public void close() {
        this.setVisible(false);
    }
}
