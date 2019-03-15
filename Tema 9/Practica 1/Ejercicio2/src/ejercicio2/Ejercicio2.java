
package ejercicio2;

import BD.BaseDatos;
import UML.Evento;
import BD.TEventos;
import Ventanas.VentanaAltaEventos;
import Ventanas.VentanaInicio;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;


public class Ejercicio2 {
    
    private static BaseDatos bd;
    private static VentanaInicio vi;
    private static VentanaAltaEventos va;
    private static Evento ev;
    private static TEventos oTEventos;
    
    public static void main(String[] args) {
        //Conectar con la base de datos
        
        bd = new BaseDatos();
        
        Connection con = bd.conectar();
        
        if(con==null){
            JOptionPane.showMessageDialog(null,"Problemas con la base de datos");
            System.exit(-1);
        }
        oTEventos = new TEventos(con);
        //Abrir la ventana
        
        vi = new VentanaInicio();
        vi.setVisible(true); 
    }
    
    public static void abrirVentanaAltas(){
        va = new VentanaAltaEventos();
        va.setVisible(true);
    }
    
    public static void darAlta(String nombre, String lugar, String fecha, String horaInicio, String horaFin, String aforo){
        ev = new Evento();
        
        ev.setNombre(nombre);
        ev.setLugar(lugar);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate f = LocalDate.parse(fecha, formatter);
        ev.setFecha(f);
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm");
        ev.setHoraInicio(LocalTime.parse(horaInicio, formatTime));
        ev.setHoraFinal(LocalTime.parse(horaInicio, formatTime));
        ev.setAforo(Integer.parseInt(aforo));
        
        TEventos.dardeAlta(ev);
        
        JOptionPane.showMessageDialog(null, "El evento ha sido dado de alta");
        va.setVisible(false);
    }
    
    public static void cerrarVentanaAltas(){
        va.setVisible(false);
    }
    
}
