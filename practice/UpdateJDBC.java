package com.jdbc.java.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

/**
 *
 * @author Md. Talal Wasim
 */
public class UpdateJDBC {

    public static void main(String[] args) {
        try {
            //create connection 
            Connection con = ConnectionProvider.getConnection();

            //creating query
            String q = "update table1 set tName=?, tCity=? where tId=?";

            //take input form user
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter new name : ");
            String name = br.readLine();
            System.out.println("Enter new city : ");
            String city = br.readLine();
            System.out.println("Enter the Student Id for update data : ");
            int id = Integer.parseInt(br.readLine());
            
            //using PreparedStatement for complex(?,?,?) query...
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1, name);
            pstmt.setString(2, city);
            pstmt.setInt(3, id);
            
            //query fire...
            //using update because this query not get any data from DB... Just set it...
            pstmt.executeUpdate();
            
            System.out.println("Update Succesfully...");
            con.close();
            
            
            
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
