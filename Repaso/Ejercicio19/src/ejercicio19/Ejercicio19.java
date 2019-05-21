package ejercicio19;

import Clases.Persona;
import Ventanas.VentanaDatos;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Ejercicio19 {

    private static Persona p;
    private static ArrayList<Persona> personas;
    private static VentanaDatos vd;
    
    public static void main(String[] args) {
        personas = new ArrayList();
        //Abrir Ventana
        vd = new VentanaDatos();
        vd.setVisible(true);

    }
    
    public static void obtenerDatos(String dni,String n,String ap,String s, String ed,String pe){
        p = new Persona();
        p.setDni(dni);
        p.setNombre(n);
        p.setApellidos(ap);
        p.setSexo(s);
        int edad = Integer.parseInt(ed);
        p.setEdad(edad);
        int peso = Integer.parseInt(pe);
        p.setPeso(peso);

        personas.add(p);
    }
    
    public static void validarDatos(){
        
    }
    
    public static void menu(){
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
    public static void abrirVentanaDatos(){
        vd.setVisible(true);
    }
            
    public static void cerrarVentanaDatos(){
        vd.setVisible(false);
        menu();
    }
            
    public static void buscar(){
        String dni = JOptionPane.showInputDialog("Introduce el DNI de la persona que quieres buscar");
        for(int x = 0; x < personas.size(); x++){
            if(personas.get(x).getDni().equals(dni)){
                cogerDatos(personas.get(x));
                /*JOptionPane.showMessageDialog(null,"DNI: " + personas.get(x).getDni() + "\n"
                + "Apellido: " + personas.get(x).getApellidos() + "\n"
                + "Nombre: " + personas.get(x).getNombre() + "\n"
                + "Sexo: " + personas.get(x).getSexo() + "\n"
                + "Edad: " + personas.get(x).getEdad() + "\n"
                + "Peso " + personas.get(x).getPeso());*/
            }else
                JOptionPane.showMessageDialog(null, "Ese DNI no corresponde a ninguna persona");
        }
    }   
    
    public static void cogerDatos(Persona p){
        String dni = p.getDni();
        String n = p.getNombre();
        String a = p.getApellidos();
        String s = p.getSexo();
        String edad = p.getEdad().toString();
        String peso = p.getPeso().toString();
        
        vd = new VentanaDatos();
        vd.verDatos(dni, n, a, s, edad, peso);
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
