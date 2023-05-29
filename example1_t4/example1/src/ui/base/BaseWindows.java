package ui.base;

import javax.swing.JFrame;

import java.awt.Dimension;

public abstract class BaseWindows extends JFrame {
    public BaseWindows(String title, Dimension size) {
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // cierra el hilo de procesamiento cuando la ventana es cerrada
        this.setSize(size);
        this.setLocationRelativeTo(this);
        setLayout(null);
    }

    public BaseWindows(String title) {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // cierra el hilo de procesamiento cuando la ventana es cerrada
        this.setSize(new Dimension(WIDTH, HEIGHT));
        this.setLocationRelativeTo(this);
        setLayout(null);
        this.setupUi();
    }

    public abstract void setupUi();

    public void open() {
        this.setVisible(true);
    }

    public void close() {
        this.setVisible(false);
    }
}
