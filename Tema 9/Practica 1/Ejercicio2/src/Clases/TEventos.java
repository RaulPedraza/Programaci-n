
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class TEventos {
    private static Connection con;
    
    public TEventos(Connection con) {
        this.con = con;
    }
    
    public static void dardeAlta(Evento ev){ 
        try{
            Statement sentencia = con.createStatement();
            
            String platilla = "insert into eventos values (?,?,?,?,?,?);";
            PreparedStatement ps = con.prepareStatement(platilla);
            ps.setString(1, ev.getNombre());
            ps.setString(2, ev.getLugar());
            ps.setDate(3, ev.getFecha());
            ps.setTime(4, ev.getHoraInicio());
            ps.setTime(5, ev.getHoraFinal());
            ps.setInt(5, ev.getAforo());
            
            int n = ps.executeUpdate();
            if (n != 1)
                JOptionPane.showMessageDialog(null, "Cero filas actualizadas");
        }
        catch(Exception e){
            
        }
        
            
        
    }
    
    
    
}
