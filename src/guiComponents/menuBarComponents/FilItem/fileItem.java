package guiComponents.menuBarComponents.FilItem;

import Listeners.menuFileOpenFileListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class fileItem extends JMenu{
    private static final int OpenFile=1;
    private static final int SaveAs=2;

    //Меню файл
    public fileItem() {
        //Меню файл
        this.setText("Файл");

        JMenuItem openFile = new JMenuItem("Открыть...");
        openFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
        openFile.addActionListener(new menuFileOpenFileListener(OpenFile));
        this.add(openFile);

        JMenuItem saveFileAs = new JMenuItem("Сохранить как...");
        saveFileAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
        saveFileAs.addActionListener(new menuFileOpenFileListener(SaveAs));
        this.add(saveFileAs);

        JMenuItem exit = new JMenuItem("Выход");
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,ActionEvent.CTRL_MASK));
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        this.add(exit);
    }

}
