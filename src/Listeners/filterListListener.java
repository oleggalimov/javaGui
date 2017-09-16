package Listeners;

import services.filterListService;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class filterListListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        filterListService.filter();

    }
}
