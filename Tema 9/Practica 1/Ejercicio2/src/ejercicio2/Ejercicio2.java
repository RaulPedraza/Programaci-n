
package ejercicio2;

import Clases.BaseDatos;
import Ventanas.VentanaAltaEventos;
import Ventanas.VentanaInicio;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class Ejercicio2 {
    
    private static BaseDatos bd;
    private static VentanaInicio vi;
    private static VentanaAltaEventos va;
    
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
    
}
