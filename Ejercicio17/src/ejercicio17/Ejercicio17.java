/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw12
 */
public class Ejercicio17 {
        public static String nombreMax;
        public static String nombreMin;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int contador = 0;
        int maximo = -1;
        int minimo = 11;
        //proceso
        //for (contador = 0; contador<40; contador ++)
        do
        {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del alumno");
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota del alumno"));
        maximo = calcularMax(nota, maximo, nombre);
        minimo = calcularMin(nota, minimo, nombre);
        contador ++;
        }
        while (contador<40);
        //Resultado en pantalla
        JOptionPane.showMessageDialog(null, nombreMax + " es el alumno con la nota mas alta con un " + maximo + " y " + nombreMin + " es el alumno con la nota mas baja con un " + minimo);
    }
    //Comprobar Maximo
    private static int calcularMax(int nota, int maximo, String nombre){
     if (nota>maximo)
     {
         maximo=nota;
         nombreMax=nombre;
     }
     return maximo;
    }
    //Comprobar Minimo
    private static int calcularMin(int nota, int minimo, String nombre){
     if (nota<minimo)
     {
         minimo=nota;
         nombreMin=nombre;
     }
     return minimo;
    }
}
