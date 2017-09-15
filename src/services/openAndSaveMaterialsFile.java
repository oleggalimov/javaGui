package services;

import guiComponents.mainWindow;
import model.material;
import javax.swing.*;
import java.io.*;

public class openAndSaveMaterialsFile {
    public static void readFile (File inputFile) {

        try (FileInputStream fin = new FileInputStream(inputFile);
             ObjectInputStream oin = new ObjectInputStream(fin)
        ) {
            DefaultListModel<material> tempModel= mainWindow.getMainListModel();
            while (fin.available()!=0) {
                tempModel.addElement((material)oin.readObject());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Не удалось открыть файл","Ошибка",JOptionPane.ERROR_MESSAGE);
        }

    }
    public static void saveFile (String path) {
        File outputfile;
        if (!path.endsWith(".dat")) {
            outputfile = new File (path + ".dat");
        } else {
            outputfile = new File (path);
        }
            try (FileOutputStream fout = new FileOutputStream(outputfile);
                 ObjectOutputStream out = new ObjectOutputStream(fout)
            ) {
                DefaultListModel<material> tempModel= mainWindow.getMainListModel();
                for (int i = 0; i < tempModel.size(); i++) {
                    out.writeObject(tempModel.getElementAt(i));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Не удалось открыть файл","Ошибка",JOptionPane.ERROR_MESSAGE);
            }
    }
}

