package com.jdbc.java.practice;

import java.sql.*;

/**
 *
 * @author Md. Talal Wasim
 */
public class SelectJDBC {

    public static void main(String[] args) {

        try {
            Connection con = ConnectionProvider.getConnection();
            
            String q = "select * from table1";
            //simple query not complex...so using statement
            
            Statement stmt = con.createStatement();
            ResultSet set= stmt.executeQuery(q);
            
            while (set.next()) { //is next row is present? then next() return true... and move cursor forward
                int id = set.getInt(1); //1 = 1st column
                //int id = set.getInt("tId"); //1 = 1st column
                String name = set.getString(2); //2 = 2nd column
                //String name = set.getString("tName"); //2 = 2nd column
                String city = set.getString(3); //3 = 3rd column
                //String city = set.getString("tCity"); //3 = 3rd column
                System.out.println(id+": "+name+" : "+city); 
            }
            
            con.close();
            
            
            
            
            

        } catch (Exception e) {
        }

    }
}
