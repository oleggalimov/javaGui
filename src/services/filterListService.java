package services;

import guiComponents.mainWindow;
import model.material;
import javax.swing.*;
import java.util.ArrayList;


public class filterListService {
    public static void filter () {
        DefaultListModel<material> listOfMaterials = mainWindow.getMainListModel();
        ArrayList <material> sortedList= new ArrayList<>();
        material m;
        for (int i = 0; i < listOfMaterials.size(); i++) {
            m=listOfMaterials.getElementAt(i);
            if (m.getName().contains(" ")) {
                sortedList.add(m);
            }
        }
        if (sortedList.size()>0) {
                material[] sortedInputList= new material[sortedList.size()];
                int counter=-1;
                for (material material:sortedList) {
                    sortedInputList[++counter]=material;
                }
                for (int i = 0; i < counter+1; i++) {
                    for (int j = 0; j < counter; j++) {
                        if (sortedInputList[i].getWeght()<sortedInputList[j].getWeght()) {
                            material material = sortedInputList[i];
                            sortedInputList[i]=sortedInputList[j];
                            sortedInputList[j]=material;
                            material=null;
                        }
                    }
                }
            listOfMaterials.removeAllElements();
                for (material material :sortedInputList) {
                    listOfMaterials.addElement(material);
                }
        } else {
            JOptionPane.showMessageDialog(null,"Заданные элементы не найдены","Вниамание",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
}
