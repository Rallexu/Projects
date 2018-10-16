/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatingChar;


import static creatingChar.chooseChampDes.characterFour;
import static creatingChar.chooseChampDes.characterOne;
import static creatingChar.chooseChampDes.characterThree;
import static creatingChar.chooseChampDes.characterTwo;
import static creatingChar.creatingCharSQL.idChar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static login.connect.con;


/**
 *
 * @author allan
 */
public class chooseChampSelectSQL {
   public static String nickDataBase;
   public static int idChampionDataBase;
   public static void searchCharacters()
   {
   try{
   String query=("SELECT nick FROM login.champion where id_player='"+idChar+"'");
   Statement stm=null;
   stm=con.createStatement();
   ResultSet rs = stm.executeQuery(query);
       if(rs.next()){
       characterOne.setText(rs.getString("nick"));  
    }
       if(rs.next()){
       characterTwo.setText(rs.getString("nick"));
    }
       if(rs.next()){
      characterThree.setText(rs.getString("nick"));
    }
       if(rs.next()){
       characterFour.setText(rs.getString("nick"));
    }   
       stm.close();
      // pivotLogin=true; 
            }
    catch (SQLException e)
    {
        //pivotLogin=false; 
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
          }
    }
   
      public static void searchCharactersIdChampion(String nickDataBase)
   {
   try{
    String querySelectIdChampion=("SELECT id_champion FROM login.champion where id_player='"+idChar+"' and nick='"+nickDataBase+"'");

   Statement stm=null;
   stm=con.createStatement();
   ResultSet rs = stm.executeQuery(querySelectIdChampion);
       if(rs.next()){
         idChampionDataBase = rs.getInt("id_champion");
  
       }
       stm.close();
            }
    catch (SQLException e)
    {
        //pivotLogin=false; 
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
          }
    }
      /*   public static void searchCharactersIdChampionToEquipment(String nickDataBase)
   {
   try{
    String querySelectIdChampionToEquipment=("SELECT id_champion FROM login.champion where id_player='"+idChar+"' and nick='"+nickDataBase+"'");

   Statement stm=null;
   stm=con.createStatement();
   ResultSet rs = stm.executeQuery(querySelectIdChampionToEquipment);
       if(rs.next()){
         idChampionDataBaseToEquipment = rs.getInt("id_champion");
           System.out.println(idChampionDataBaseToEquipment);
       }
       stm.close();
            }
    catch (SQLException e)
    {
        //pivotLogin=false; 
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
          }
    }*/
}   

