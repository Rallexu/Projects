/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.*;
import static login.connect.con;


/**
 *
 * @author allan
 */
public class loginMethod {
    
    public static void methodLogin() 
    
            
          throws SQLException  {
 
    Statement stmt = null;
    String query = "Select login from players";
    try {
        stmt = con.createStatement();
        ResultSet readQuery = stmt.executeQuery(query);
        while (readQuery.next()) {
            String login = readQuery.getString("login");
             }
        } catch (SQLException e ) {
        System.out.println(e);
            } finally {
        if (stmt != null) {
            stmt.close(); }
              }
    
    
         }
    }

    

    
