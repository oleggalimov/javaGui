package services;

import model.material;

import java.io.*;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

public class openMaterialsFile {
    File fileForRead;
    List <material> listOfMaterials = new ArrayList<>();
    public openMaterialsFile (File inputFile) {
        this.fileForRead=inputFile;
    }
    public void readFile () {
        try (FileInputStream fin = new FileInputStream(fileForRead);
             ObjectInputStream oin = new ObjectInputStream(fin)
        ) {
            while (fin.available()!=0) {
                listOfMaterials.add((material)oin.readObject());
            }
            for (material m: listOfMaterials) {
                System.out.println(m);
            }
        } catch (IOException ioex) {

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

