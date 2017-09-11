package services;

import model.listOfMaterials;
import model.material;

import java.io.*;

import java.util.ArrayList;
import java.util.List;

public class openAndSaveMaterialsFile {
    public static void readFile (File inputFile) {
        List <material> materials = new ArrayList<>();
        try (FileInputStream fin = new FileInputStream(inputFile);
             ObjectInputStream oin = new ObjectInputStream(fin)
        ) {
            System.out.println("Читаем файл..");
            while (fin.available()!=0) {
                materials.add((material)oin.readObject());
            }
            for (material m: materials) {
                System.out.println(m);
            }
            listOfMaterials.setMaterialList(materials);
        } catch (StreamCorruptedException ioex) {
            ioex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void saveFile (String path) {
        File outputfile;
        if (!path.endsWith(".dat")) {
            outputfile = new File (path + ".dat");
        } else {
            outputfile = new File (path);
        }
        System.out.println(outputfile.getName());

            try (FileOutputStream fout = new FileOutputStream(outputfile);
                 ObjectOutputStream out = new ObjectOutputStream(fout)
            ) {
                System.out.println("Записываем файл..");
                for (material m: listOfMaterials.getMaterialList()) {
                    out.writeObject(m);
                }
            } catch (StreamCorruptedException ioex) {
                ioex.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}

