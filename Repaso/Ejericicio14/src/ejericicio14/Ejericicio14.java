
package ejericicio14;

import Clases.Persona;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Ejericicio14 {

    private static Persona p;
    private static ArrayList<Persona> personas;
    
    public static void main(String[] args) {
        personas = new ArrayList();
        pedirDatos();
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion: \n"
                + "1.-Buscar una persona con el DNI \n"
                + "2.-Eliminar una persona \n"
                + "3.-Ordenar por apellido \n"
                + "4.-Mostrar todas las personas"));
        switch(opcion){
            case 1:
                buscar();
                break;
            case 2: 
                eliminar();
                break;
            case 3:
                ordenar();
                break;
            case 4:
                mostrar();
                break;
        }
       
    }
    
    public static void pedirDatos(){
        int continuar;
        do{
            String dni = JOptionPane.showInputDialog("Introduce el DNI");
            String apellido = JOptionPane.showInputDialog("Introduce el apellido");
            String nombre = JOptionPane.showInputDialog("Introduce el nombre");
            String sexo = JOptionPane.showInputDialog("Introduce el sexo (H | M)");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad"));
            int peso = Integer.parseInt(JOptionPane.showInputDialog("Introduce el peso"));
        
            validarDatos();
            
            p = new Persona(dni,apellido,nombre,sexo,edad,peso);
            personas.add(p);   
            
            continuar = JOptionPane.showConfirmDialog(null,"Quieres introducir otra persona");
        }
        while(continuar == 0);
        
    }
    
    public static void validarDatos(){
        
    }
    
    public static void buscar(){
        String dni = JOptionPane.showInputDialog("Introduce el DNI de la persona que quieres buscar");
        for(int x = 0; x < personas.size(); x++){
            if(personas.get(x).getDni().equals(dni)){
                JOptionPane.showMessageDialog(null,"DNI: " + personas.get(x).getDni() + "\n"
                + "Apellido: " + personas.get(x).getApellidos() + "\n"
                + "Nombre: " + personas.get(x).getNombre() + "\n"
                + "Sexo: " + personas.get(x).getSexo() + "\n"
                + "Edad: " + personas.get(x).getEdad() + "\n"
                + "Peso " + personas.get(x).getPeso());
            }else
                JOptionPane.showMessageDialog(null, "Ese DNI no corresponde a ninguna persona");
        }
    }
    
    public static void eliminar(){
        String dni = JOptionPane.showInputDialog("Introduce el DNI de la persona que quieres eliminar");
        for(int x = 0; x < personas.size(); x++){
            if(personas.get(x).getDni().equals(dni)){
                personas.remove(x);
            }else
                JOptionPane.showMessageDialog(null, "Ese DNI no corresponde a ninguna persona");
        }    
    }
    
    public static void ordenar(){
        
    }
    
    public static void mostrar(){
        
    }
}
