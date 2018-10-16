/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;


import java.sql.*;

/**
 *
 * @author allan
 */
public class connect {
    
   private static final String USERNAME="root";
   private static final String PASSWORD="Wozek148@";
   private static final String CONN_STRING="jdbc:mysql://localhost:3306/login?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
   public static Connection con ;
   private static  boolean pivotLogin=false;
   
   public static void connecting(){
      
    try{
    con = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
        System.out.println("connected");
    
        }catch(SQLException e){
            
            System.err.print(e);
        }
    }
   
   
   public static boolean loginMethod(String zmienna,String zmienna2)
   {
       
  
 
   
   try{
   String query=("SELECT login,password FROM login.players where login='" +zmienna +"'  and password='"+zmienna2+"'");
   Statement stm=null;
   stm=con.createStatement();
   ResultSet rs = stm.executeQuery(query);
    if(rs.next()){pivotLogin=true;}
    else{System.out.println("bad login or password");pivotLogin=false;}

   
       System.out.println(rs);      
       stm.close();
      // pivotLogin=true; 
            }
    catch (Exception e)
    {
        //pivotLogin=false; 
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
          }
   return pivotLogin;
      
    }
    
}   
