
package ejercicio1;

import BD.BaseDatosRelacional;
import Clases.Cliente;
import Tablas.*;
import Ventanas.*;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class Ejercicio1 {

    private static BaseDatosRelacional bdr;
    private static TAbogados oTAbogados;
    private static VentanaInicio vi;
    private static VentanaAltaAbogados va;
    private static Cliente c;
    
    public static void main(String[] args) {
        
        bdr = new BaseDatosRelacional();
        
        Connection con = bdr.conectar();
        
        if(con==null){
            JOptionPane.showMessageDialog(null,"Problemas con la base de datos");
            System.exit(-1);
        }
        oTAbogados = new TAbogados(con);
        //Abrir la ventanaInicio
        
        vi = new VentanaInicio();
        vi.setVisible(true);
    }
    
    public static void abrirAltaAbogados(){
        va = new VentanaAltaAbogados();
        va.setVisible(true);
    }
    
    public static void cerrarAltaAbogados(){
        va.setVisible(false);
    }
    
    public static void DardeAltaAbogado(String dni,String n,String ap,String d){
        c = new Cliente();
        
    }
}
