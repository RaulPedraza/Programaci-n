/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

import javax.swing.JOptionPane;
/**
 *
 * @author 1gdaw12
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        double nrGenerado = Math.floor(Math.random()*(0-100+1)+100);
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Teclea un numero"));
        String finalizar="si";
        //proceso
        while ("si".equals(finalizar))
        {
            //Miramos el numero que nos han dado
             finalizar = tratarNota(numero, nrGenerado, finalizar);
             //Pedir otro numero
            if (finalizar.equalsIgnoreCase("si"))
            {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Teclea otro numero"));
            }
        }
        // TODO code application logic here
    }
    public static String tratarNota(int numero, double nrGenerado, String finalizar){
        //Comparamos los numeros
        if (numero!=nrGenerado){
            if (numero<nrGenerado){
                JOptionPane.showMessageDialog(null, "Intentalo con un numero mas grande");
            }else 
                JOptionPane.showMessageDialog(null, "Intentalo con un numero mas pequeño");
            //Continuar ¿?
            do {
                finalizar = JOptionPane.showInputDialog("¿Quieres continuar?");
            }
            while (finalizar.equalsIgnoreCase("si") == false && finalizar.equalsIgnoreCase("no") == false);
            //Correcto
        }else{
            JOptionPane.showMessageDialog(null, "Enhorabuena, has acertado.");
            finalizar = "no";
        }
        return finalizar;
    }
}
