/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this   
 */
package bank.management.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Shuja hassan
 */
public class dbConnection{
    
    public Connection connection;
    public Statement statement;
    
    public dbConnection(){
    String url = "jdbc:mysql://127.0.0.1:3306/bankmanagementsystem";
    String username = "root";
    String password = "12345678";
    
     try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivers loaded sucessfully!");
        
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
            System.out.println("Database connected sucessfully!");
     }
            catch(ClassNotFoundException e){
            System.out.println("Driver class not found" + e.getMessage());
        }
            catch(SQLException e){
                System.out.println("Database connection failed!" + e.getMessage());
            }
    
    }
}
    

