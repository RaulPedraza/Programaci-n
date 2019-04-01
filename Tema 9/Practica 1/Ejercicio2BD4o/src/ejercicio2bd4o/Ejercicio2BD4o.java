package ejercicio2bd4o;



import BD.BaseDatos;
import BD.TEventos;
import Clases.Empresa;
import Clases.Evento;
import Clases.Persona;
import Excepciones.sinTexto;
import Ventanas.VentanaAltaEventos;
import Ventanas.VentanaAltaPersonas;
import Ventanas.VentanaInicio;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;


public class Ejercicio2BD4o {
    
    private static VentanaInicio vi;
    private static VentanaAltaEventos va;
    private static Evento ev;
    private static TEventos te;
    private static VentanaAltaPersonas vap;
    private static Persona p;
    private static Empresa emp;
    
    public static void main(String[] args) { 
        try{
            //Conectar con la base de datos
            
            BaseDatos bd = new BaseDatos();
            te = new TEventos (bd.Conectar());

            //Abrir la ventana
        
            vi = new VentanaInicio();
            vi.setVisible(true); 
        }
        catch(Exception e){
            
        }
    }
    
    public static void abrirVentanaAltas(){
        va = new VentanaAltaEventos();
        va.setVisible(true);
    }
    
    public static void cerrarVentanaAltas(){
        va.setVisible(false);
    }
    
    public static void abrirVentanaAltaPersonas(){
        vap = new VentanaAltaPersonas();
        vap.setVisible(true);
    }
    
    public static void cerrarVentanaAltaPersonas(){
        vap.setVisible(false);
    }
    
    public static void darAlta(String nombre, String lugar, String fecha, String horaInicio, String horaFin, String aforo){
        ev = new Evento();
        
        ev.setNombre(nombre);
        ev.setLugar(lugar);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate f = LocalDate.parse(fecha, formatter);
        ev.setFecha(f);
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm");
        ev.setHoraInicio(LocalTime.parse(horaInicio, formatTime));
        ev.setHoraFinal(LocalTime.parse(horaFin, formatTime));
        ev.setAforo(Integer.parseInt(aforo));
        
        te.darAlta(ev);
        
        JOptionPane.showMessageDialog(null, "El evento ha sido dado de alta");
        va.setVisible(false);
    }
    
    public static void darBaja(){
        try{
            String nombreEvento = JOptionPane.showInputDialog("Introduce el nombre del evento que quieres dar de baja");
            if (nombreEvento.isEmpty()){
                throw new sinTexto();
            }
            boolean encontrado = te.buscarEvento(nombreEvento);
            if(encontrado == true){
                te.borrarEvento(nombreEvento);
            }
            JOptionPane.showMessageDialog(null, "El evento ha sido dado de baja");
            
        }
        catch(sinTexto e){
            JOptionPane.showMessageDialog(null, "No has introducido el nombre del evento");
        }
        catch(Exception e){
            
        }
    }
    
    public static void buscarEvento(){
        try{
            String nombreEvento = JOptionPane.showInputDialog("Introduce el nombre del evento que quieres dar de baja");
            if (nombreEvento.isEmpty()){
                throw new sinTexto();
            }
            boolean encontrado = te.seleccionarEvento(nombreEvento);
            
            if(encontrado == true){
                JOptionPane.showMessageDialog(null, "El evento existe");
            }else
                JOptionPane.showMessageDialog(null, "El evento no existe");
            
            }
        catch(sinTexto e){
            JOptionPane.showMessageDialog(null, "No has introducido el nombre del evento");
        }
        catch(Exception e){
            
        }
    }
    
    public static void modificarEvento(String nombre)throws Exception{
        
        ev = te.encontrarEvento(new Evento(nombre));
        
        va = new VentanaAltaEventos(ev);
        va.setVisible(true);
    }
    
    public static void modificar(String nombre, String lugar, String fecha, String horaInicio, String horaFin, String aforo)throws Exception{
        
        ev.setNombre(nombre);
        ev.setLugar(lugar);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate f = LocalDate.parse(fecha, formatter);
        ev.setFecha(f);
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm");
        ev.setHoraInicio(LocalTime.parse(horaInicio, formatTime));
        ev.setHoraFinal(LocalTime.parse(horaFin, formatTime));
        ev.setAforo(Integer.parseInt(aforo));
        
        te.modificar(ev);
        
        JOptionPane.showMessageDialog(null, "El evento ha sido modificado");
        va.setVisible(false);
    }
    
    public static boolean comprobar(String nEvento) throws Exception{
         ev = te.encontrarEvento(new Evento(nEvento));
         
         return true;
    }
    
    public static void apuntarPersona(String dni, String nombre, String apellidos, String telefono, String epresa){
        
    }
}
