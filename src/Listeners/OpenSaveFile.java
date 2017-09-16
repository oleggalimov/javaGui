package Listeners;


import model.material;
import services.openAndSaveFileFilter;
import services.openAndSaveMaterialsFile;


import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class OpenSaveFile implements ActionListener {
    private int ActionType;

    public OpenSaveFile(int actionType) {
        this.ActionType=actionType;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (ActionType) {
            case 1: {
                JFileChooser jf = new JFileChooser();
                jf.setFileFilter(new openAndSaveFileFilter());
                int succes=jf.showOpenDialog(null);
                if (succes==0) {
                    openAndSaveMaterialsFile.readFile(jf.getSelectedFile());
                }
            }
            break;
            case 2: {
                JFileChooser jf = new JFileChooser();
                jf.setFileFilter(new openAndSaveFileFilter());
                int success=jf.showSaveDialog(null);
                if (success==0) {
                    openAndSaveMaterialsFile.saveFile(jf.getSelectedFile().getAbsolutePath());
                }

            }
            break;
            default:
                try {
                    throw new Exception("Не найден метод для нажатия");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
        }
    }
}
