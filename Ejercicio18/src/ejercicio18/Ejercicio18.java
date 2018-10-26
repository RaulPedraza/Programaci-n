/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw12
 */
public class Ejercicio18 {
    //variables globales
    public static int n1 = 1;
    public static int n2 = 1;
    public static int n3 = 0;
    public static String serie = n1 + " " + n2 + " ";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int contador = 2;    
        //Procesos
        int nrFinal = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos numeros de la serie de Fibonacci quieres?"));
        while (contador<nrFinal){
            siguienteValor();
            continuarSerie();
            contador ++;
        }
        JOptionPane.showMessageDialog(null, serie);    
        // TODO code application logic here
    }
    public static void siguienteValor(){
        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
    }
    public static void continuarSerie(){
        serie = serie + n3 + " ";
    }
}
