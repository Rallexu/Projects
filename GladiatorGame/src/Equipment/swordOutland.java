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
public class swordOutland extends EquipmentCreatorAbstract {
  public static String nameItem="Miecz Outland";
  public static int valueItem;
  public static int idSw;
  
    public swordOutland() {
        super(idSwordHandler,nameItem,valueItem,nameOfItemSword);
        
    }
  
}
