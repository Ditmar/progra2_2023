package edt;

import java.awt.Dimension;

import javax.swing.SwingUtilities;

import ui.Window;

public class Graphics implements Runnable {
    public Graphics() {
        SwingUtilities.invokeLater(this);
    }

    @Override
    public void run() {
        Window window = new Window("Main windows", new Dimension(500, 500));
        window.open();
    }

}
