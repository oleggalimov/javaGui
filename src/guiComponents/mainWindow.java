package guiComponents;

import Listeners.addButton;
import Listeners.clearButton;
import Listeners.deleteFromListButton;
import Listeners.filterListListener;
import guiComponents.menuBarComponents.aboutItem;
import guiComponents.menuBarComponents.fileItem;
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

    private static JList <material> jList;

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
        jList= new JList<>();
        jList.setModel(mainListModel);
        leftPanel = new JScrollPane(jList);
        leftPanel.setBorder(BorderFactory.createTitledBorder("Список материалов"));

        //правая панель
        Box box = Box.createVerticalBox();
        JButton addMaterial = new JButton("Добавить");
        addMaterial.addActionListener(new addButton());
        addMaterial.setAlignmentX(JComponent.CENTER_ALIGNMENT);

        JButton clearForm = new JButton("Очистить");
        clearForm.addActionListener(new clearButton());
        clearForm.setAlignmentX(JComponent.CENTER_ALIGNMENT);

        JButton delFromList = new JButton("Удалить");
        delFromList.addActionListener(new deleteFromListButton());
        delFromList.setAlignmentX(JComponent.CENTER_ALIGNMENT);

        JButton getFilteredList = new JButton("Фильтровать");
        getFilteredList.addActionListener(new filterListListener());
        getFilteredList.setAlignmentX(JComponent.CENTER_ALIGNMENT);

        box.add(addMaterial);
        box.add(Box.createVerticalStrut(10));
        box.add(delFromList);
        box.add(Box.createVerticalStrut(10));
        box.add(clearForm);
        box.add(Box.createVerticalStrut(10));
        box.add(getFilteredList);


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
    public static JList<material> getjList() {
        return jList;
    }

}
