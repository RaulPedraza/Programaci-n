package ejercicio8;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio8 {
    
    private static ArrayList<Integer> listaNumeros;
    
    public static void main(String[] args) {
        int numero;
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: \n" + "(Para parar de introducir numero escribe -99)"));
            if (numero != -99){
                listaNumeros.add(numero);
            }    
        }
        while(numero != -99);
        
        contar();
        suma();
        media();
    }
    
    public static void contar(){
        int contador = 0;
        for(int x = 0; x < listaNumeros.size(); x++){
            contador = contador++;
        }
        JOptionPane.showMessageDialog(null, "Hay un total de " + contador + " valores introducidos");
    }
    
    public static void suma(){
        int suma = 0;
        for(int x = 0; x < listaNumeros.size(); x++){
            int numero = listaNumeros.get(x);
            suma = suma + numero;
        }
        JOptionPane.showMessageDialog(null, "La suma de todos los valores es de " + suma);
    }
    
    public static void media(){
        int suma = 0;
        for(int x = 0; x < listaNumeros.size(); x++){
            int numero = listaNumeros.get(x);
            suma = suma + numero;
        }
        float media = suma / listaNumeros.size();
        
        JOptionPane.showMessageDialog(null, "La media de los valores es de " + media);
        
        String cadena = "";
        for(int i = 0; i < listaNumeros.size(); i++){
            int numero = listaNumeros.get(i);
            cadena = cadena + numero + " ";
        }
        JOptionPane.showMessageDialog(null, cadena);
    }
    

}
