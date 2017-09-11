package services;

import javax.swing.filechooser.FileFilter;
import java.io.File;

/**
 * Created by oleg on 11.09.17.
 */
public class openAndSaveFileFilter extends FileFilter {
    @Override
    public boolean accept(File file) {
        if ((file.getName().endsWith(".dat")) || (file.isDirectory())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getDescription() {
        return "*.dat";
    }
}
