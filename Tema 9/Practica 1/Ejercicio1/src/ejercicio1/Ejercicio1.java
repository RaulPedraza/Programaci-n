
package ejercicio1;

import Clases.BaseDeDatos;
import Clases.Persona;
import Clases.TPersonas;
import Ventanas.VentanaDatos;
import Ventanas.VentanaOpciones;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio1 {

    private static Persona p;
    private static VentanaDatos vd;
    private static VentanaOpciones vo;
    private static TPersonas oTPersona;
    private static BaseDeDatos bd;
    private static ArrayList<Persona> listaPersonas;
    
    public static void main(String[] args) {
        try{
        bd = new BaseDeDatos();
        Connection con = bd.conectar();
        if (con == null){
            JOptionPane.showMessageDialog(null,"Problemas con la base de datos");
            System.exit(-1);
        }
        oTPersona = new TPersonas(con);
        vo = new VentanaOpciones();
        vo.setVisible(true);
        }
        catch(Exception e){
            
        }
    }
    
    public static void ejecutarOpcion(String tfOpcion){
        int opcion = Integer.parseInt(tfOpcion);
        switch(opcion){
        
        case 1:
            vo.setVisible(false);
            
            vd = new VentanaDatos();
            vd.setVisible(true);
            break;
        case 2:
            String nombre= pedirNombre();
            Persona miPersona = oTPersona.buscarNombre(nombre);
            enseñarPersona(miPersona);
            break;
        case 3:
            listaPersonas = oTPersona.consultarPersonas();
            break;
        case 4:
            System.exit(0);
            break;
      
        }
    }
    
    public static void darAlta(String nombre, String edad,String profesion,String telefono){
        Persona p = new Persona (nombre,Integer.parseInt(edad),profesion,telefono);
        //Insertar en la base de datos
        oTPersona.darAlta(p);
        JOptionPane.showMessageDialog(null, "La persona ha sido dada de alta");
    }
    
    public static String pedirNombre(){ 
        String nombre = JOptionPane.showInputDialog("Introduce el nombre de la persona");
        return nombre;
    }
    
    public static void enseñarPersona(Persona miPersona){
        JOptionPane.showMessageDialog(null,"Nombre: " + miPersona.getNombre());
        JOptionPane.showMessageDialog(null,"Edad: " + miPersona.getEdad());
        JOptionPane.showMessageDialog(null,"Profesion: " + miPersona.getProfesion());
        JOptionPane.showMessageDialog(null,"Telefono: " + miPersona.getTelefono());
    }
    
    public static void salir(){
        bd.cerrar();
    }
    
}
