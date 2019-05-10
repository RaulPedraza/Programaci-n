package ejercicio.pkg7;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio7 {
    private static ArrayList<Integer> listaNumeros;
    
    public static void main(String[] args) {       
        listaNumeros = new ArrayList();
        int continuar = 0;
        do{
            JOptionPane.showInputDialog("Introduce un numero");
            continuar = Integer.parseInt(JOptionPane.showConfirmDialog(null, "Quieres introducir otro numero?"));
        }
        while(continuar == 0);
        
        int opcion = menu();
        
        switch(opcion){
            case 1:
                addNumero();
                break;
            case 2:
                buscarNumero();
                break;
            case 3:
                modificarNumero()
                break;
        }
    }
    
    public static int menu(){
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Escoge una de las opciones: \n"
                + "1.-Agregar un numero \n"
                + "2.-Buscar un numero \n"
                + "3.-Modificar un numero \n"
                + "4.-Eliminar un numero \n"
                + "5.-Insertar un numero en un posicion concreta"));
        return opcion;
    }
    
    public static void addNumero(){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce en numero que quieres Agregar"));
        listaNumeros.add(numero);
    }
    
    public static void buscarNumero(){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Que numero quieres buscar"));
        boolean buscar = listaNumeros.contains(numero);
        if (buscar == true){
            JOptionPane.showMessageDialog(null,"El numero que has puesto esta dentro del ArrayList");
        }else
            JOptionPane.showMessageDialog(null, "El numero que has puesto no esta dentro del ArrayList");
    }
    
    public static void modificarNumero(){
        
    }
}
