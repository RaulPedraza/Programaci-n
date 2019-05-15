package ejercicio.pkg7;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio7 {
    private static ArrayList<Integer> listaNumeros;
    
    public static void main(String[] args) {       
        listaNumeros = new ArrayList();
        int continuar = 0;
        do{
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
            continuar = JOptionPane.showConfirmDialog(null, "Quieres introducir otro Numero");
            listaNumeros.add(numero);
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
                modificarNumero();
                break;
            case 4:
                eliminarNumero();
                break;
            case 5:
                añadirNumero();
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
    
    public static void eliminarNumero(){
        String cadena = "";
        for(int x = 0; x < listaNumeros.size(); x++){
            int numero = listaNumeros.get(x);
            cadena = cadena + numero + " ";
        }
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Que numero quieres eliminar: \n" + cadena + "(Pon la posicion del numero)"));
        posicion = posicion -1;
        listaNumeros.remove(posicion);
        
        String cadena2 = "";
        for(int x = 0; x < listaNumeros.size(); x++){
            int numero = listaNumeros.get(x);
            cadena2 = cadena2 + numero + " ";
        }
        
        JOptionPane.showMessageDialog(null, cadena2);
    }
    
    public static void añadirNumero(){
        Integer numero = Integer.parseInt(JOptionPane.showInputDialog("Que numero quieres introducir"));
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("En que posicion quieres meter el numero"));
        String cadena = "";
        posicion = posicion -1;
        listaNumeros.add(posicion, numero);
        
        
        for(int x = 0; x < listaNumeros.size(); x++){
            int valor = listaNumeros.get(x);
            cadena = cadena + valor + " ";
        }
        
        JOptionPane.showMessageDialog(null, cadena);
    }
}
