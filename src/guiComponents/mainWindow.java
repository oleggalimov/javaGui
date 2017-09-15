package guiComponents;

import guiComponents.menuBarComponents.AboutIyem.aboutItem;
import guiComponents.menuBarComponents.FilItem.fileItem;
import model.material;

import javax.swing.*;
import java.awt.*;


/**
 * Created by oleg on 09.09.17.
 */
public class mainWindow {
    private static JFrame mwindow;
    private static JScrollPane leftPanel;
    private static JPanel rigthPanel;
    private static DefaultListModel <material> mainListModel;

    private static JMenuBar createMenuPanel() {
        JMenuBar menuBar = new JMenuBar();//панель
        menuBar.add(new fileItem());
        menuBar.add(new aboutItem());
        return menuBar;
    }

    public static void BuildMainWindow () {
        //Инициализируем главное окно
        mwindow=new JFrame();
        mwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mwindow.setTitle("Управление материалами");
        mwindow.setSize(600,500);
        mwindow.setLocationRelativeTo(null);


        //левая панель
        mainListModel = new DefaultListModel<>();
        JList <material> jList = new JList<>();
        jList.setModel(mainListModel);
        leftPanel = new JScrollPane(jList);
        leftPanel.setBorder(BorderFactory.createTitledBorder("Список материалов"));

        //правая панель
        Box box = Box.createVerticalBox();
        JButton addMaterial = new JButton("Добавить");
        addMaterial.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        JButton clearForm = new JButton("Очистить");
        clearForm.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        box.add(addMaterial);
        box.add(Box.createVerticalStrut(10));
        box.add(clearForm);
        rigthPanel = new JPanel();
        rigthPanel.add(box);

        Container mainContainer = mwindow.getContentPane();
        mainContainer.setLayout(new BoxLayout(mainContainer,BoxLayout.LINE_AXIS));//устанавливаем выравнивание
        mainContainer.add(leftPanel);
        mainContainer.add(rigthPanel);
        mwindow.setJMenuBar(createMenuPanel());

        mwindow.setVisible(true);
    }
    public static DefaultListModel<material> getMainListModel() {
        return mainListModel;
    }

}
