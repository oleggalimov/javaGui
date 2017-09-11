package model;

import java.util.List;

/**
 * Created by oleg on 11.09.17.
 */
public  class listOfMaterials {
    private static List <material> materialList;

    public static List<material> getMaterialList() {
        return materialList;
    }

    public static void setMaterialList(List<material> materialList) {
        listOfMaterials.materialList = materialList;
    }
}
