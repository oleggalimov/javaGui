package guiComponents;

import javax.swing.*;

public class windowCreateFabric {
    public static JFrame getWindow (String title, int Width, int Height) {
        JFrame window = new JFrame(title);
        window.setSize(Width,Height);
        window.setLocationRelativeTo(null);

        return window;
    }
}
