package guiComponents;

import javax.swing.*;

/**
 * Created by oleg on 09.09.17.
 */
public class mainWindow extends JFrame {
    public  mainWindow () {
        createMainWindow();
    }
    private void createMainWindow () {
        JFrame mainWindow = new JFrame("Управление матриалами");
        mainWindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainWindow.setTitle("Управление материалами");
        mainWindow.setSize(400,300);
        mainWindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setVisible(true);
    }
}
