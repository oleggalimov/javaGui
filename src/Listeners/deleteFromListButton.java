package Listeners;

import guiComponents.mainWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class deleteFromListButton implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        int index = mainWindow.getjList().getSelectedIndex();
        if (mainWindow.getMainListModel().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Список пуст!","Ошибка удаления элемента",JOptionPane.ERROR_MESSAGE);
        } else if (index==-1) {
            JOptionPane.showMessageDialog(null,"Необходимо выбрать элемент!","Ошибка удаления элемента",JOptionPane.INFORMATION_MESSAGE);
        }else {
            mainWindow.getMainListModel().remove(index);
        }

    }
}
