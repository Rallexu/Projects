/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dealersSQL;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static login.connect.con;
import static Equipment.swordAzeroth.valueItem;
/**
 *
 * @author allan
 */
public class ArmorSQLSelectValue {
    public static String nameOfItemSword;
      public static void selectPrizeSword(int idShopSword) throws SQLException
   {
   try{
   
   String querySelectSword = "SELECT prize_sword FROM login.shopSword where idshopSword='"+idShopSword+"'";
 
   Statement state=null;
   state=con.createStatement();
   ResultSet rs = state.executeQuery(querySelectSword);

   if(rs.next()){ 
    valueItem = rs.getInt("prize_sword");
     
      }  
  nameOfItemSword = Integer.toString(valueItem); 
   }
   catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
          }
       }
   } 

