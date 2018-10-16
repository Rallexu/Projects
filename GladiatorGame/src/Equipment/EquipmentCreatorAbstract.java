/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Equipment;

/**
 *
 * @author allan
 */
abstract public class EquipmentCreatorAbstract {
   
    
    public int idItemHead;
    public String nameItemHead;
    public int valueItemHead;
    
    public String numberAsString;
    public EquipmentCreatorAbstract(int idItemHead,String nameItemHead,int valueItemHead,String numberAsString){
      this.idItemHead=idItemHead;
      this.nameItemHead=nameItemHead;
      this.valueItemHead=valueItemHead;
      this.numberAsString=numberAsString;
    }
   
  
}
