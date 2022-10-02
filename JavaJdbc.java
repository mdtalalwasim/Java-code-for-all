package javajdbc;

import java.sql.*;
import java.io.*;

/**
 *
 * @author Md. Talal Wasim
 */
public class JavaJdbc {

    public static void main(String[] args) {

        try {

            //database connection creation
            //load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //creating connection
            String url = "jdbc:mysql://localhost:3306/youtube";
            String uname = "root";
            String password = "wasim";

            Connection con = DriverManager.getConnection(url, uname, password);

            //end database connection creation
            //creating query....
            String q = "insert into table1(tName,tCity) values (?,?)";
            //dynamic queery or parameterized query
            //for fireing dynamic query we used PreparedStatement

            //get the PreparedStatement object...
            PreparedStatement pstmt = con.prepareStatement(q);
            //PreparedStatement is Interface
            //prepareStatement() is method..

            /*
			//take value through Scanner....
			Scanner input = new Scanner(System.in);

			System.out.println("Enter name : ");
			String name =input.nextLine();

			System.out.println("Enter your city : ");
			String city =input.nextLine();

             */
            //take input through BufferReader()
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name : ");
            String name = br.readLine();

            System.out.println("Enter your city : ");
            String city = br.readLine();

            //set the values to query...
            //pstmt.setString(1, "Abdur Rahman Nahi");
            pstmt.setString(1, name);
            //pstmt.setString(2, "Rangpur");
            pstmt.setString(2, city);

            pstmt.executeUpdate();//only use of statement q pass here. 

            System.out.println("Data Inserted...!");
            con.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
