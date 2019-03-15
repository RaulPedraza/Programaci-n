package BD;

import UML.Evento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
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
            ps.setDate(3, conversionDate(ev.getFecha()));
            ps.setTime(4, conversionTime(ev.getHoraInicio()));
            ps.setTime(5, conversionTime(ev.getHoraFinal()));
            ps.setInt(6, ev.getAforo());
            
            int n = ps.executeUpdate();
            if (n != 1)
                JOptionPane.showMessageDialog(null, "Cero filas actualizadas");
        }
            catch(Exception e){
            
            System.out.println(e.getClass());
        }   
    }
    public static java.sql.Date conversionDate(LocalDate fecha){
        return java.sql.Date.valueOf(fecha);
    }   
    
    public static java.sql.Time conversionTime(LocalTime horaI){
        return java.sql.Time.valueOf(horaI);
    }
    
    public static java.sql.Time conversionTIme(LocalTime horaF){
        return java.sql.Time.valueOf(horaF);
    }
}
