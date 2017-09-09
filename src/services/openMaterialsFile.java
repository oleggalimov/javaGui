package services;

import model.material;

import java.io.*;
import java.util.ArrayList;

public class openMaterialsFile {
    File f;
    public openMaterialsFile (File inputFile) throws IOException {
        this.f=inputFile;
    }
    public void readFile () {
        //InputStream inputStream =  openMaterialsFile.class.getResourceAsStream("/resources/materials.dat");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)))) {
            String tempName;
            int  countOfMaterials;
            ArrayList<material> listOfMaterials = new ArrayList<>();

            countOfMaterials=Integer.parseInt(br.readLine());
            System.out.println("Будет обработано материалов: "+countOfMaterials);

            for (int i = 0; i < countOfMaterials; i++) {
                tempName=br.readLine();
                if (tempName.trim().contains(" ")) {
                    listOfMaterials.add(new material(
                                    tempName,
                                    Float.parseFloat(br.readLine()),
                                    Integer.parseInt(br.readLine())
                            )
                    );
                } else  {
                    br.readLine();br.readLine();
                }
            }
            if (listOfMaterials.size()==0) {
                System.out.println("Заданных веществ не обнаружено");
            } else {
               //TODO доделать обработку файла
                System.out.println(listOfMaterials.size());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

