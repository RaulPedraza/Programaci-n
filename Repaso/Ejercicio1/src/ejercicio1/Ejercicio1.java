
package ejercicio1;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class Ejercicio1 {

    
    public static void main(String[] args) {
        int [] listaNumeros = new int [3];
        listaNumeros = llenarArray(listaNumeros);
        int opcion = menu();
        
        switch (opcion){
            case 1:
                mostrarNumeros(listaNumeros);
                break;
            case 2:
                mostrarUnNumero(listaNumeros);
                break;
            case 3:
                modificarUnNumero(listaNumeros);
                break;
            case 4:
                vaciarPosicion(listaNumeros);
                break;
            case 5:
                calcSumaMedia(listaNumeros);
                break;
            case 6:
                ordenarArray(listaNumeros);
                break;
        }
        
    }
    
    public static  int[] llenarArray(int[] listaNumeros){
        for (int x = 0; x < listaNumeros.length; x++){
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
            listaNumeros [x] = numero;
        }
        return listaNumeros;
    }
    
    public static int menu(){
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion: \n"
                                                                  + "1.- Mostrar el contenido de todas las posiciones. \n"
                                                                  + "2.- Mostrar el contenido de una posición concreta. \n"
                                                                  + "3.- Modificar el contenido de una posición concreta. \n"
                                                                  + "4.- Vaciar el contenido de una posición concreta. \n"
                                                                  + "5.- Calcular la suma y la media de todos los números \n"
                                                                  + "6.- Ordenar los números de mayor a menor. \n"));
        return opcion;
    }
    
    public static void mostrarNumeros(int[] listaNumeros){
        String listado = "";
        
        for (int x = 0; x < listaNumeros.length; x++){
            int numero = listaNumeros[x];
            listado = listado + numero + "\n";
        }
        
        JOptionPane.showMessageDialog(null, listado);
    }
    
    public static void mostrarUnNumero(int[] listaNumeros){
        int numero = listaNumeros[Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion de la quieres saber el valor"))];
        
        JOptionPane.showMessageDialog(null, numero);
    }
    
    public static void modificarUnNumero(int[] listaNumeros){
        String listado = "";
        
        for (int x = 0; x < listaNumeros.length; x++){
            int numero = listaNumeros[x];
            listado = listado + numero + "\n";
        }
        
        int posicion = Integer.parseInt(JOptionPane.showInputDialog(listado + " \n"
                                        + "Qué posicion quieres modificar?"));
        
        listaNumeros[posicion -1] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el nuevo valor"));
        listado = "";
        for (int x = 0; x < listaNumeros.length; x++){
            int numero = listaNumeros[x];
            listado = listado + numero + "\n";
        }
        
        JOptionPane.showMessageDialog(null, listado);
    }
    
    public static void vaciarPosicion(int[] listaNumeros){
        String listado = "";
        
        for (int x = 0; x < listaNumeros.length; x++){
            int numero = listaNumeros[x];
            listado = listado + numero + "\n";
        }
        
        int posicion = Integer.parseInt(JOptionPane.showInputDialog(listado + " \n"
                                        + "Qué posicion quieres vaciar?"));
        
        listaNumeros [posicion -1] = 0;
        
        listado = "";
        for (int x = 0; x < listaNumeros.length; x++){
            int numero = listaNumeros[x];
            listado = listado + numero + "\n";
        }
        
        JOptionPane.showMessageDialog(null, listado);
    }
    
    public static void calcSumaMedia (int[] listaNumeros){
        int suma = 0;
        
        for (int x = 0; x < listaNumeros.length; x++){
            int numero = listaNumeros[x];
            suma = suma + numero;
        }
        float media = suma / listaNumeros.length;
        JOptionPane.showMessageDialog(null, "La suma de los 10 numeros es de " + suma + " y la media es de " + media);
    }
    
    public static void ordenarArray(int[] listaNumeros){
        for(int x = 0; x < listaNumeros.length; x++){
            for(int i = 1; i < listaNumeros.length-i-1; x++){
                if (listaNumeros[i] > listaNumeros[i-1]){
                    
                }
            }
        }
        
        String listado = "";
        for (int x = 0; x < listaNumeros.length; x++){
            int numero = listaNumeros[x];
            listado = listado + numero + "\n";
        }
        
        JOptionPane.showMessageDialog(null, listado);
    }
}
