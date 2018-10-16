/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatingChar;



import static creatingChar.chooseChampSelectSQL.idChampionDataBase;
import static creatingChar.chooseChampSelectSQL.nickDataBase;
import static creatingChar.chooseChampSelectSQL.searchCharactersIdChampion;
import java.sql.*;
import static login.connect.con;
import static login.loginMain.loginCharacter;


/**
 *
 * @author allan
 */
public class creatingCharSQL {
    
   private static final String USERNAME="root";
   private static final String PASSWORD="Wozek148@";
   private static final String CONN_STRING="jdbc:mysql://localhost:3306/login?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
   
   private static  boolean pivotLogin=false;
   private static int levelDataBase=0;
   private static int experienceDataBase=0;
   private static int gold=50;
   private static  int Strength=10;
   private static  int Charisma=10;
   private static  int Vitality=30;
   private static  int Skill=10;
   private static  int StatsPoints=10;
   public  static int idChar;
   private static int sword_1=0;
   private static int sword_2=0;
   private static int sword_3=0;
   private static int sword_4=0;
   private static  int armor=0;
   private static  int elixirOne=0;
   private static  int elixirTwo=0;
   private static  int sword_id=0;
   private static  int armor_id=0;
   public static void creatingPlayer(String nick) throws SQLException
   {
    
   try{
       
   String querySelect = "SELECT id_login FROM login.players where login='"+loginCharacter+"'";
       /*pobieram id loginu uzytkownika z tabeli players*/
        

   Statement state=null;
   state=con.createStatement();
   ResultSet rs = state.executeQuery(querySelect);

   
   if(rs.next()){ 
     idChar = rs.getInt("id_login");//przypisuje id loginu do zmiennej idChar
    
   }
   
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
          }
   }
   
   public static void insertPlayerSQL (){
         try{
   String query ="INSERT INTO login.champion (nick, level, experience, id_player, gold, stats_points, strength, charisma, vitality,skill,sword_id, armor_id) "+
   "values ('"+nickDataBase+"', '"+levelDataBase+"','"+experienceDataBase+"','"+idChar+"','"+gold+"','"+StatsPoints+"','"+Strength+"','"+Charisma+"','"+Vitality+"','"+Skill+"','"+sword_id+"','"+armor_id+"')";
   Statement state=null;
   state=con.createStatement();
   PreparedStatement preparedStmt = con.prepareStatement(query);   
   preparedStmt.execute();
   searchCharactersIdChampion(nickDataBase);
   }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
          }
      }
    
      public static void insertPlayerEquipmentSQL(){
         try{
   String querySecond ="INSERT INTO login.equipment (sword_1, sword_2, sword_3, sword_4, armor, elixir_one, elixir_two, id_champion_foreign,id_login_foreign) "+
   "values ('"+sword_1+"', '"+sword_2+"', '"+sword_3+"', '"+sword_4+"', '"+armor+"','"+elixirOne+"','"+elixirTwo+"','"+idChampionDataBase+"','"+idChar+"')";
   Statement state=null;
   state=con.createStatement();
   PreparedStatement preparedStmtSecond = con.prepareStatement(querySecond);    
   preparedStmtSecond.execute();
   
   }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
        }
      }
    } 

