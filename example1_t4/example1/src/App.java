import javax.swing.SwingUtilities;

import edt.Graphics;

import java.lang.Runnable;

public class App {
    public static void main(String[] args) throws Exception {
        // Hilo EDT
        // SwingUtilities.invokeLater(() -> {
        // // se ejecuta el hilo de procesamient

        // });
        new Graphics();
    }
}
