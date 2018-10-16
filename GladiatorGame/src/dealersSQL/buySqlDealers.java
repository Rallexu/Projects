/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dealersSQL;


import Equipment.EquipmentCreatorAbstract;
import static creatingChar.chooseChampSelectSQL.idChampionDataBase;
import static creatingChar.creatingCharSQL.idChar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;
import java.util.ArrayList;
import static login.connect.con;

/**
 *
 * @author allan
 */
public class buySqlDealers {
 private static int swordNumber=1;
 public static int variableToCheck;
  int size=1;
  int pointerArray=0;
   public static void buySqlSword(int idSword,int swordNumber){
     try{
         
   String query="UPDATE equipment SET sword_"+swordNumber+" ='"+idSword+"' where id_champion_foreign='"+idChampionDataBase+"'" + "and id_login_foreign='"+idChar+"'" ;
   Statement state=null;
   state=con.createStatement();
   PreparedStatement preparedStmt = con.prepareStatement(query);


  
        preparedStmt.execute();
     
   }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
          }
 
      }
   
   public void loopEmptySlotCheck(ArrayList<EquipmentCreatorAbstract> listSizeSword){  
   pointerArray=0;
   size=1;
   while(pointerArray<(int)(listSizeSword.size())){
       
    buySqlSword(listSizeSword.get(pointerArray).idItemHead,size);
       System.out.println(listSizeSword.get(pointerArray).idItemHead);
    size++;
    pointerArray++;
    
     }   
   }
   
   
      static boolean searchEmptSlot(int swordNumberFunction){
     try{
   String querySearchEmptys = "SELECT sword_"+swordNumberFunction+" as Result FROM login.equipment where id_champion_foreign='"+idChampionDataBase+"' " + "and id_login_foreign='"+idChar+"'"  ;
  Statement state=null;
   state=con.createStatement();
   ResultSet rs = state.executeQuery(querySearchEmptys);
         System.out.println(idChampionDataBase+" "+idChar+" ");
   if(rs.next()){ 
     variableToCheck = rs.getInt("Result");  
      }
         System.out.println(variableToCheck);
   }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
          }
     if(variableToCheck!=1){ 
         return true;   
     }
     else{
         return false;
        }
      }  
    }
