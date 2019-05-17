
package ejercicio16;

import clases.Persona;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio16 {

    private static Persona p;
    private static ArrayList<Persona> personas;
    
    public static void main(String[] args) {
        personas = new ArrayList();
        double precioFinal = 0;
        int cola = (int) (Math.random() * 50);
        
        for(int x = 0; x < cola; x++){
            p = new Persona();
            int edad = (int) (Math.random() * (60-5+1) + 5);
            p.setEdad(edad);
            
            personas.add(p);
        }
        
        for(int x = 0; x < personas.size(); x++){
            if(personas.get(x).getEdad() < 10){
                precioFinal = precioFinal + 1;
            }else if(personas.get(x).getEdad() < 18 && personas.get(x).getEdad() > 10){
                precioFinal = precioFinal + 2.5;
            }else
                precioFinal = precioFinal + 5;
        }
        
        JOptionPane.showMessageDialog(null, "Se han recaudado un total de " + precioFinal + " €");
    }
    
}
