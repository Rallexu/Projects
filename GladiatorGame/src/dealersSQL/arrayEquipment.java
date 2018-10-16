/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dealersSQL;

import Equipment.EquipmentCreatorAbstract;
import java.util.ArrayList;

/**
 *
 * @author allan
 */
public class arrayEquipment {
    
    public static void setEquipmentArray(ArrayList<EquipmentCreatorAbstract> arrayHandler,EquipmentCreatorAbstract obj ){
        arrayHandler.add(obj);
    
    }
}
