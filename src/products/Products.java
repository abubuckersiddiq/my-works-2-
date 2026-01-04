//package products;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class Products {
//	public static void main(String [] args)
//	{
//		try {
//			
//		//Step 1:	Load or Register Driver
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			
//			
//		//Step 2: Establish Connection 
//			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/products","root","root");
//			
//			
//			//step 3: Create Stmt
//			Statement s = c.createStatement;
//			
//			
//			//Step 4: Execute the query
//			
//			s.execute_Update("insert INTO recent_release values (1001, 'laptop' , 'i5 13thgen HX with RTX 4060 6GB card', '30000k' , 1 )");
//			System.out.println("data saved");
//			
//		}
//		catch(ClassNotFoundException | SQLException e)
//		{
//			e.printStackTrace();
//			System.out.println("catch block");
//			
//		}
//		
//		
//	}
//
//}

package products;

import java.sql.*;

public class Products {
    public static void main(String[] args) {
        try {
            // Step 1: Load or Register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish Connection
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/products", "root", "root");

            // Step 3: Create Statement
            Statement s = c.createStatement();

            // Step 4: Execute the query
           // s.executeUpdate("INSERT INTO product_table VALUES (1001, 'laptop', 'i5 13thgen HX with RTX 4060 6GB card', 30000, 1)");
            s.executeUpdate("INSERT INTO product_table VALUES (1002, 'laptop', 'R7 9300x  with RTX 4060 8GB card', 80000, 1)");
            
            System.out.println("Data saved");

//            // Step 5: Close resources
//            s.close();
//            c.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

