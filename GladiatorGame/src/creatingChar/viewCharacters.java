/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
package creatingChar;

import login.*;
import creatingChar.game_menu;
import java.sql.*;
import static login.connect.con;
import static login.loginMain.loginCharacter;

/*
 *
 * @author allan
 */
/*
public class viewCharacters {
    
   private static final String USERNAME="root";
   private static final String PASSWORD="Wozek148@";
   private static final String CONN_STRING="jdbc:mysql://localhost:3306/login?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
   
   
  
 
   
   public static boolean creatingPlayer(String nick)
   {
    
   try{
  // String query=("INSERT INTO login.champion " + "VALUES (,'"+nick+"', '"+level+"', '"+experience+")");
        String query ="INSERT INTO login.champion (nick, level, experience,nick_player) "+ "values ('"+nick+"', '"+level+"','"+experience+"','"+loginCharacter+"')";
 //('"+nick+"', '"+level+"', '"+experience+"')");
   
   PreparedStatement preparedStmt = con.prepareStatement(query);
    if( preparedStmt.execute()){pivotLogin=true;System.out.println(pivotLogin);}
    
     preparedStmt.close();

            }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
          }
   return pivotLogin;
      
    }
    
}   */
