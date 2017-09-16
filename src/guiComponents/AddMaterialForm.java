package guiComponents;

import model.material;
import javax.swing.*;
import java.awt.*;

public class AddMaterialForm extends JDialog {
    private String title = "Добавление материала";
    private Dimension dimension = new Dimension(300,300);

    public AddMaterialForm () {
        this.setTitle(title);
        this.setSize(dimension);
        this.setLocationRelativeTo(null);

        addComponents();

        this.setVisible(true);
    }
    private void addComponents () {
        Box mainBox = Box.createVerticalBox();

        Box topBox = Box.createVerticalBox();
        Box bottomBox = Box.createHorizontalBox();

        JTextField name = new JTextField();
        name.setBorder(BorderFactory.createTitledBorder("Название"));
        JTextField weight = new JTextField();
        weight.setBorder(BorderFactory.createTitledBorder("Вес"));

        JComboBox<Integer> conductor = new JComboBox<>();
        conductor.setBorder(BorderFactory.createTitledBorder("Проводимость"));
        for (int i = 0; i < 3; i++) {
            conductor.addItem(i);
        }
        JButton saveMaterial = new JButton("Сохранить");
        saveMaterial.addActionListener(e-> {
            String nameString = name.getText().trim();
            String weigthString = weight.getText().trim();
            if (nameString.isEmpty()||weigthString.isEmpty()) {
                JOptionPane.showMessageDialog(null,"Поля не могут быть пустым!","Ошибка заполнения",JOptionPane.ERROR_MESSAGE);
            }
            else {
                try {
                    float weightFloat = Float.parseFloat(weigthString);
                    mainWindow.getMainListModel().addElement(new material(nameString,weightFloat,conductor.getItemAt(conductor.getSelectedIndex())));

                } catch (NumberFormatException numEx) {
                    JOptionPane.showMessageDialog(null,"Указано некорректное значение веса!","Ошибка заполнения",JOptionPane.ERROR_MESSAGE);
                }

            }
        });

        JButton clearForm = new JButton("Сбросить");
        clearForm.addActionListener(e -> {
            name.setText(null);
            weight.setText(null);
            conductor.setSelectedIndex(0);
        });

        topBox.add(name);
        topBox.add(weight);
        topBox.add(conductor);

        bottomBox.add(saveMaterial);
        bottomBox.add(clearForm);

        mainBox.add(topBox);
        mainBox.add(bottomBox);

        this.setMinimumSize(new Dimension(200,300));
        this.getContentPane().add(mainBox);

    }
}
