package Listeners;

import guiComponents.mainWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class clearButton implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        mainWindow.getMainListModel().clear();
    }
}
