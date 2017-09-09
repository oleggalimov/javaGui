package Listeners;

import services.openMaterialsFile;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class menuFileOpenFileListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        JFileChooser jf = new JFileChooser();
        int succes=jf.showDialog(null,"Открыть файл..");
        if (succes==0) {
            System.out.println("Открываем файл..");
            openMaterialsFile om = new openMaterialsFile(jf.getSelectedFile());
            om.readFile();
        }
    }
}
