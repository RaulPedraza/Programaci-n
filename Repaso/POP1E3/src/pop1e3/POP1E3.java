
package pop1e3;

import Persona.Persona;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class POP1E3 {

    private static ArrayList<Persona> listaPersonas;
    private static Persona p;
    
    public static void main(String[] args) {
        crearPersonas();
        int metodo = Integer.parseInt(JOptionPane.showInputDialog("Selecciona una opcion: n/" + 
                                    "1.- Persona mas mayor n/" +
                                    "2.- Personas que viven en Elche n/" +
                                    "3.- Personas mayores de edad"));
        switch (metodo){
            case 1: 
                personaMayor();
                break;
            case 2: 
                vivirElche();
                break;
            case 3:
                mayoresEdad();
                break;
        }
        
    }
    public static void crearPersonas(){
        listaPersonas = new ArrayList<Persona>();
        p = new Persona ("Ander",("15/07/1996"),"Calle Venezuela",01002,"Vitoria-Gasteiz");
        listaPersonas.add(p);
        p = new Persona ("Raul",("29/07/1999"),"Calle Portal de Legutiano",01002,"Vitoria-Gasteiz");
        listaPersonas.add(p);
        p = new Persona ("Mikel",("23/06/2000"),"Calle Dato",01002,"Elche");
    }
    
    public static void personaMayor(){
         JOptionPane.showMessageDialog(null, "hola");
    }
    
    public static void vivirElche(){
        String listaElche = "";
        String c;
        for (int x = 0; x<listaPersonas.size(); x++){
            c = listaPersonas.get(x).getCiudad();
            if (c.contains("Elche")){
                listaElche = listaElche + listaPersonas.get(x).getNombre();
            }
        }
        JOptionPane.showMessageDialog(null, listaElche);
    }
    
    public static void mayoresEdad(){
        
    }
}
