
package ejercicio2;

import Clases.BaseDatos;
import Clases.Evento;
import Clases.TEventos;
import Ventanas.VentanaAltaEventos;
import Ventanas.VentanaInicio;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;


public class Ejercicio2 {
    
    private static BaseDatos bd;
    private static VentanaInicio vi;
    private static VentanaAltaEventos va;
    private static TEventos oTEventos;
    private static Evento ev;
    public static void main(String[] args) {
        //Conectar con la base de datos
        
        bd = new BaseDatos();
        
        Connection con = bd.conectar();
        
        if(con==null){
            JOptionPane.showMessageDialog(null,"Problemas con la base de datos");
            System.exit(-1);
        }
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
        LocalDate f = LocalDate.parse(fecha);
        ev.setFecha(f);
        ev.setHoraInicio(LocalTime.parse(horaInicio));
        ev.setHoraFinal(LocalTime.parse(horaInicio));
        ev.setAforo(Integer.parseInt(aforo));
        oTEventos.dardeAlta(ev);
        JOptionPane.showMessageDialog(null, "El evento ha sido dado de alta");
    }
}
