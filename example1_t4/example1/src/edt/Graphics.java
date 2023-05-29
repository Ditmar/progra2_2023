package edt;

import java.awt.Dimension;

import javax.swing.SwingUtilities;

import services.UserServices;
import ui.Window;

public class Graphics implements Runnable {
    public Graphics() {
        SwingUtilities.invokeLater(this);
    }

    @Override
    public void run() {
        UserServices service = new UserServices();
        Window window = new Window(service, "Ventana Principal", new Dimension(1000, 500));
        window.open();
    }

}
