package guiComponents;

import guiComponents.menuBarComponents.AboutIyem.aboutItem;
import guiComponents.menuBarComponents.FilItem.fileItem;
import javax.swing.*;


/**
 * Created by oleg on 09.09.17.
 */
public class mainWindow extends JFrame {

    public  mainWindow () {
        createMainWindow();
    }
    private void createMainWindow () {
        JFrame mainWindow = new JFrame();
        mainWindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainWindow.setTitle("Управление материалами");
        mainWindow.setSize(400,300);
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setJMenuBar(createMenuPanel());
        mainWindow.setVisible(true);
    }
    private JMenuBar createMenuPanel () {
        JMenuBar menuBar = new JMenuBar();//панель
        menuBar.add(new fileItem());
        menuBar.add(new aboutItem());
        return menuBar;
    }
}
