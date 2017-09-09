package guiComponents.windows;

import guiComponents.windowCreateFabric;

import javax.swing.*;
import java.awt.*;

@Deprecated
public class openFileWindow extends JFrame {
    public openFileWindow() {
        this.setTitle("Открыть файл..");
        this.setSize(300,200);
        this.setLocationRelativeTo(null);

        Container container = this.getContentPane();
        JPanel jp1 = new JPanel();
        JTextField jTextField = new JTextField("Введите путь");
        jTextField.setSize(200,100);
        jp1.add(jTextField);


        JPanel jp2 = new JPanel();
        JButton open = new JButton("Открыть");
        JButton close = new JButton("Отмена");
        jp2.add(open);
        jp2.add(close);
        container.add(jp1);
        container.add(jp2);
        this.setLayout(new BoxLayout(container,BoxLayout.Y_AXIS));

    }
}
