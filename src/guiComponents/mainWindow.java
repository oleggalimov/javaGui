package guiComponents;

import guiComponents.menuBarComponents.AboutIyem.aboutItem;
import guiComponents.menuBarComponents.FilItem.fileItem;
import javax.swing.*;
import java.awt.*;


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
        mainWindow.setSize(600,500);
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setJMenuBar(createMenuPanel());
        Container mainContainer = mainWindow.getContentPane();
        mainContainer.setLayout(new BoxLayout(mainContainer,BoxLayout.LINE_AXIS));//устанавливаем выравнивание

        //левая панель
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel,BoxLayout.Y_AXIS));

        JTextField nameOfMaterial = new JTextField("Материал");
        nameOfMaterial.setBorder(BorderFactory.createTitledBorder("Наименование материала"));

        JTextField weigthOfMaterial = new JTextField("0.0");
        weigthOfMaterial.setBorder(BorderFactory.createTitledBorder("Удельный вес"));

        JTextField isConductor = new JTextField("0");
        isConductor.setBorder(BorderFactory.createTitledBorder("Свойство проводимости"));

        leftPanel.add(nameOfMaterial);
        leftPanel.add(weigthOfMaterial);
        leftPanel.add(isConductor);

        //правая панель
        JPanel rihthPAnel = new JPanel();
        //rihthPAnel.setLayout(new BoxLayout(rihthPAnel,BoxLayout.Y_AXIS));
        Box box = Box.createVerticalBox();

        JButton addMaterial = new JButton("Добавить");
        addMaterial.setAlignmentY(JComponent.CENTER_ALIGNMENT);
        JButton clearForm = new JButton("Очистить");
        clearForm.setAlignmentY(JComponent.CENTER_ALIGNMENT);
        box.add(addMaterial);
        box.add(Box.createVerticalStrut(10));
        box.add(clearForm);

        rihthPAnel.add(box);
        mainContainer.add(leftPanel);
        mainContainer.add(rihthPAnel);



        mainWindow.setVisible(true);
    }
    private JMenuBar createMenuPanel () {
        JMenuBar menuBar = new JMenuBar();//панель
        menuBar.add(new fileItem());
        menuBar.add(new aboutItem());
        return menuBar;
    }
}
