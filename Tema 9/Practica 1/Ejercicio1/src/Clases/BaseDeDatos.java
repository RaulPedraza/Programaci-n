
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;


public class BaseDeDatos {
    
    private static Connection con;
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            String url="jdbc:mysql://localhost:3307/"+"t9p1e1";
            String usuario = "root";
            String pass = "usbw";
            con = DriverManager.getConnection(url ,usuario ,pass);
            return con;
        }
        catch (Exception e){
            return null;
        }   
    }
    
    public void cerrar(){
        try{
           con.close(); 
        }
        catch (Exception e){
            
        }
    }
}
