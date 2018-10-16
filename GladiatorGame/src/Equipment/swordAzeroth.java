/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Equipment;

import static dealersSQL.ArmorSQLSelectValue.nameOfItemSword;
import static dealersSQL.SqlPrizeDealers.idSwordHandler;





/**
 *
 * @author allan
 */
public class swordAzeroth extends EquipmentCreatorAbstract {
  public static String nameItem="Miecz Azeroth";
  public static int valueItem;
  public static int idSw;
 
    public swordAzeroth() {
        super(idSwordHandler,nameItem,valueItem,nameOfItemSword);
      

      
    }
  
}
