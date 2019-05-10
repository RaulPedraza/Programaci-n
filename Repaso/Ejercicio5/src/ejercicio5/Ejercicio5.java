package ejercicio5;

import javax.swing.JOptionPane;


public class Ejercicio5 {

    
    public static void main(String[] args) {
        int [] listaNumeros = new int[10];
        
        for(int x= 0; x < listaNumeros.length; x++){
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
            listaNumeros[x] = numero;
        }
        int opcion = menu();
        
    }
    
    public static int menu(){
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Escoge una de las opciones: \n"
                                    + "1.- Mirar si existe un valor en el Array \n"
                + "2.- Ordenar de menor a mayor \n"
                + "3.- Convertir a String \n"
                + "4.- Convertir a ArrayList \n"
                + "5.- Establecer un valor para todas las posiciones"));
        
        return opcion;
    }
}
