package guiComponents.menuBarComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
/*Класс для создания меню Справка*/

public class aboutItem extends JMenu {

    public aboutItem() {
        //строим меню "О программе"
        this.setText("Справка");//заголовок
        this.setMnemonic(KeyEvent.VK_H);//горячая клавиша - ALt+H
        JMenuItem jMenuItemAbout = new JMenuItem("О программе");
        jMenuItemAbout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
        jMenuItemAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame about = new JFrame("О программе");
                about.setSize(300,100);
                about.setLocationRelativeTo(null);
                Container container = about.getContentPane();
                JLabel jl = new JLabel("<html>Программа для работы с материалами. </br></br>Галимов Олег Давлетгулович, 2017</html>");
                //jl.setVerticalAlignment(JLabel.CENTER);
                //jl.setHorizontalAlignment(JLabel.CENTER);
                jl.setBorder(BorderFactory.createTitledBorder("Версия 1.0") );
                container.add(jl);
                about.setResizable(false);
                about.setVisible(true);
            }
        });
        this.add(jMenuItemAbout);
    }


}
