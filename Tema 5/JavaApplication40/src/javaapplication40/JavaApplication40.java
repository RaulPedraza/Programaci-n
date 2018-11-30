
package javaapplication40;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;


public class JavaApplication40 {
    
    public static ArrayList <Float> valores = new ArrayList();
    
    public static void main(String[] args) {
        int continuar;
        int fin;
        int opcion = 0;
        do
        {
            float valor = Float.parseFloat(JOptionPane.showInputDialog("Introduce un valor"));
            valores.add(valor);
            continuar = JOptionPane.showConfirmDialog(null, "¿Quieres continuar introduciendo valores?");
        }
        while (continuar == 0);
        do
        {
        opcion = mostrarMenu(opcion);
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
                convertirArray();
                break;
            case 5:
                mostrarCantidad();
                break;
            case 6:
                insertarElemento();
                break;
            case 7:
                insertarElementoV2();
                break;
            case 8:
                borrarPosicion();
                break;
            case 9 :
                sumaMedia();
                break;
            case 10:
                
        }
        }
        while (opcion != 10);
    }
        
    public static int mostrarMenu(int opcion){
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
        return (opcion);
    }
    
    public static void maximoMinimo(){
        float maximo,minimo;
        maximo = minimo = valores.get(0);
        for (int x = 1; x<valores.size();x++){
            if (valores.get(x) > maximo){
                maximo = valores.get(x);
            }
            if (valores.get(x) < minimo){
                minimo = valores.get(x);
            }
        }
        JOptionPane.showMessageDialog(null, "El valor  mas grande es " + maximo + " y el mas pequeño es " + minimo);
    }
    
    public static void buscarNumero(){
        float numero = Float.parseFloat(JOptionPane.showInputDialog("Introduce el numero que quieres comprobar haber si esta"));
        int contador = 0;
        
            if (valores.contains(numero)){
                JOptionPane.showMessageDialog(null, "El numero que has introducido esta en la lista");
            }else 
                JOptionPane.showMessageDialog(null, "El numero que has introducido no esta en la lista");                       
    }
    
    public static void borrarValor(){
        JOptionPane.showMessageDialog(null, valores);
        float numero = Float.parseFloat(JOptionPane.showInputDialog("Introduce el numero que quieres borrar"));
        
        valores.remove(numero);
        JOptionPane.showMessageDialog(null, valores); 
    }  
    
    public static void convertirArray (){
        Object [] numeros = valores.toArray();
        JOptionPane.showMessageDialog(null, Arrays.asList(numeros));
    }
    
    public static void mostrarCantidad(){
        boolean vacio = false;
        int cantidad  = valores.size();
        vacio = valores.isEmpty();
        if (vacio == true){
            JOptionPane.showMessageDialog(null, "La lista no tiene valores dentro");
        }else
            JOptionPane.showMessageDialog(null, "Hay un total de " + cantidad + " valores en la lista");
    }
    
    public static void insertarElemento(){
        float numero = Float.parseFloat(JOptionPane.showInputDialog("Intoduce el numero que quieres añadir a la lista"));
        valores.add(numero);
        JOptionPane.showMessageDialog(null, valores);
    }
    
    public static void insertarElementoV2(){
        float numero = Float.parseFloat(JOptionPane.showInputDialog("Intoduce el numero que quieres añadir a la lista"));
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Intoduce el numero que quieres añadir a la lista"));
        valores.add((posicion - 1), numero);
        JOptionPane.showMessageDialog(null, valores);
    }
    
    public static void borrarPosicion(){
        JOptionPane.showMessageDialog(null, valores);
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Intoduce el numero de la posicion que quieres eliminar"));
        valores.remove((posicion - 1));
        JOptionPane.showMessageDialog(null, valores); 
    }
    public static void sumaMedia(){
        float suma = 0;
        float media;
        for (int x = 0; x<valores.size(); x++){
            suma += valores.get(x);
        }
        media = suma / valores.size();
        JOptionPane.showMessageDialog(null, "La suma de todos los valores de la lista es " + suma + " y la media de los valores es de " + media);
    }
}

