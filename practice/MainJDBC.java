package com.jdbc.java.practice;

import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Md. Talal Wasim
 */
public class MainJDBC {

    public static void main(String[] args) {
        try {
            //System.out.println("com.jdbc.java.practice.MainJDBC.main()");

            Connection c = ConnectionProvider.getConnection();

            //creating a query...
            String q = "insert into images(pic) values(?)";

            PreparedStatement pstmt = c.prepareStatement(q);

            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(null);
            File file = jfc.getSelectedFile();

            FileInputStream fis = new FileInputStream(file);

            pstmt.setBinaryStream(1, fis, fis.available());

            pstmt.executeUpdate();

            System.out.println("Image Inserted...Done !");
            JOptionPane.showMessageDialog(null, "Image Inserted into Database!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
