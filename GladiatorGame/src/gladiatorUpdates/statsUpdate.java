/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gladiatorUpdates;

import static creatingChar.chooseChampSelectSQL.idChampionDataBase;
import java.sql.PreparedStatement;
import java.sql.Statement;
import static login.connect.con;

/**
 *
 * @author allan
 */
public class statsUpdate {
    
    public static void addStatsUpdate(int zmienna,String nameArea){
         try{
  String query="UPDATE champion SET "+nameArea+" = '"+zmienna+"' where id_champion='"+idChampionDataBase+"'";
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
    }

