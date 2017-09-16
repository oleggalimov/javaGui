package Listeners;

import guiComponents.AddMaterialForm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addButton implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e) {
        AddMaterialForm addMaterialForm = new AddMaterialForm();
    }
}
