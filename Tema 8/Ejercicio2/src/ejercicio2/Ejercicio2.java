
package ejercicio2;

import Modelo.Persona;
import Ventanas.Ventana1;
import Ventanas.Ventana2;
import java.util.ArrayList;

public class Ejercicio2 {
    
    private static ArrayList<listaPersonas>;
    
    private static Ventana1 vap;
    private static Ventana2 v1;

    public static void main(String[] args) {
        listaPersonas = new ArrayList<Persona>();
        
        
    }
    
    public static void altaPersona(String nombre, String apellido, String DNI){
        listaPersonas.add(new Persona (nombre,apellido,DNI));
    }
    
    public static void salir(){
        //Elimina la ventana
        vap.dispose();
        //Crear y mostrar la ventana 2
        v1 = new Ventana2(generarListado());
        v1.setVisible(true);
    }
    
    public static String generarListado(){
        String datos = "";
        for (int x = 0; x< listaPersonas.lenght; x++){
            
        }
            datos = "No hay datos que mostrar";
        return datos;
    }
    
    public static void terminar(){
        v1.dispose();
        System.exit(0);
    }
    
}
