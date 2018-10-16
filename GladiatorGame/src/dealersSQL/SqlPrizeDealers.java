/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dealersSQL;


import static dealersSQL.ArmorSQLSelectValue.selectPrizeSword;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static login.connect.con;

/**
 *
 * @author allan
 */
public class SqlPrizeDealers {
     
    public static int idSwordHandler;
   public static void selectIdSword(String nameItemSQL) throws SQLException
   {
   try{
   
   String querySelectSword = "SELECT idshopSword FROM login.shopSword where  name_sword='"+nameItemSQL+"'";
 
   Statement state=null;
   state=con.createStatement();
   ResultSet rs = state.executeQuery(querySelectSword);

   if(rs.next()){ 
     idSwordHandler = rs.getInt("idshopSword");
     selectPrizeSword(idSwordHandler); 
      } 
     
   }
   catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
          }
       }
   }
