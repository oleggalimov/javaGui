package services;

import model.material;

import java.io.*;

import java.util.ArrayList;
import java.util.List;

public class openMaterialsFile {
    public static void readFile (File inputFile) {
        List <material> listOfMaterials = new ArrayList<>();
        try (FileInputStream fin = new FileInputStream(inputFile);
             ObjectInputStream oin = new ObjectInputStream(fin)
        ) {
            while (fin.available()!=0) {
                listOfMaterials.add((material)oin.readObject());
            }
            for (material m: listOfMaterials) {
                System.out.println(m);
            }
        } catch (IOException ioex) {
            ;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

