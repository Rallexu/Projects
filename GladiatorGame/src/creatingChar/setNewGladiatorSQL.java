/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatingChar;

import static creatingChar.chooseChampSelectSQL.idChampionDataBase;
import static creatingChar.creatingCharSQL.idChar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static login.connect.con;


/**
 *
 * @author allan
 */
public class setNewGladiatorSQL  {
     
    
  public static  int experienceDataBaseSetter;
  public static  int levelDataBaseSetter;
  public static  int goldDataBaseSetter; 
  
  public static  int StrengthSetter;
  public static  int CharismaSetter;
  public static  int VitalitySetter;
  public static  int SkillSetter;
  public static  int StatsPointSetter;
  public static  int SwordIdSetter;
  public static  int ArmorIdSetter;
  
   
   /* public static void selectorToSelectNick(){

        String queryNickDatabase=("SELECT id_champion FROM login.champion where id_player='"+idChar+"' and nick='"+nickDataBase+"'");
        try{
            
       Statement setterNickDatabase=null;
       setterNickDatabase=con.createStatement();
       ResultSet rs = setterNickDatabase.executeQuery(queryNickDatabase);

       if(rs.next()){
           nickDataBase=getText("nick");//przypisuje nick do zmiennej NickDataBase
       }
            
       System.out.println(experienceDataBaseSetter);
     // setNewGladiator(experienceDataBase,levelDataBase,goldDataBase,nickDataBase);
         //setter.close();
   }
    catch (SQLException e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
          }
        }*/
    

    //Method to set new gladiator ,necessary to use upper method becouse of nickDatabase , before selected just in creating char 
    public static void selectorToSetterGladiator() throws SQLException
   {    
   try{
   String query=("SELECT level,gold,experience,stats_points,strength,charisma,vitality,skill,sword_id,armor_id FROM login.champion where id_player='"+idChar+"' and id_champion='"+idChampionDataBase+"'");
   Statement setter=null;
   setter=con.createStatement();
   ResultSet rs = setter.executeQuery(query);
        
       while(rs.next()){
           experienceDataBaseSetter = rs.getInt("experience"); 
           levelDataBaseSetter = rs.getInt("level"); 
           goldDataBaseSetter = rs.getInt("gold");
           StrengthSetter = rs.getInt("strength");
           CharismaSetter = rs.getInt("charisma");
           VitalitySetter = rs.getInt("vitality");
           SkillSetter = rs.getInt("skill");
           StatsPointSetter = rs.getInt("stats_points");
           SwordIdSetter = rs.getInt("sword_id");
           ArmorIdSetter = rs.getInt("armor_id");
       } 

     // setNewGladiator(experienceDataBase,levelDataBase,goldDataBase,nickDataBase);
         //setter.close();
   }
    catch (SQLException e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
          }
        }
    }

