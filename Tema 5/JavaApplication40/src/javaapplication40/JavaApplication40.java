
package javaapplication40;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class JavaApplication40 {
    
    public static int opcion;
    public static ArrayList <Float> valores = new ArrayList();
    public static void main(String[] args) {
        
        int continuar;
        int opcion = 0;
        do
        {
            float valor = Float.parseFloat(JOptionPane.showInputDialog("Introduce un valor"));
            valores.add(valor);
            continuar = JOptionPane.showConfirmDialog(null, "¿Quieres continuar introduciendo valores?");
        }
        while (continuar == 0);
        mostrarMenu();
        switch (opcion)
        {
            case 1:
                maximoMinimo();
                break;
            case 2: 
                buscarNumero();
                break;
            case 3:
                borrarValor();
                break;
            case 4:
                convertir_a_Array();
                break;
            case 5:
                mostrarCantidad();
                break;
            case 6:
                inserterElemento();
                break;
            case 7:
                insertarElementoPosicion();
                break;
            case 8:
                borrarPosicion();
                break;
            case 9 :
                suma_y_media();
                break;
            case 10:
                
        }
    }
        
    public static void mostrarMenu(){
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduce la opcion que quieres realizar \n"
                + "\n"
                + "1.- Visualizar el valor maximo y minimo \n"
                + "2.- Buscar uno de los numeros introducidos \n"
                + "3.- Borrar uno de los valores introducidos \n"
                + "4.- Convertir este ArrayList en un Array \n"
                + "5.- Mostrar en numero de elementos dentro de ArrayList \n"
                + "6.- Insertar un nuevo elemento \n"
                + "7.- Insertar un nuevo elemento en la posicion que quieras \n"
                + "8.- Borrar un elemento de una posicion concreta \n"
                + "9.- Calcular la suma de los valores y la media entre ellos \n"
                + "10.- Finalizar el programa"));
    }
    
    public static void maximoMinimo(){
        int maximo = ;
        int minimo = 99999999,99;
        for (int x = 0; x<valores.size();x++){
            if (x==0){
                maximo = valores(x);
                minimo = valores(x);
            }else{
                if (maximo<x){
                    maximo = x;
                }
                if (minimo>x){
                    minimo = x;
                }      
            }        
        }
        JOptionPane.showMessageDialog(null, "El valor  mas grande es " + maximo + " y el mas pequeño es " + minimo);
    }
}
