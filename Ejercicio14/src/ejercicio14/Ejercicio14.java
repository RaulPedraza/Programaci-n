/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw12
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int contador = 0;
        float suma = 0;
        //proceso
        do{
        float numero = Float.parseFloat(JOptionPane.showInputDialog(null, "Teclea un numero"));
        suma = suma + numero;
        contador ++;
        }
        while (contador != 10);
        JOptionPane.showMessageDialog(null, "El valor de la suma de los 10 nuneros es de " + suma);
          
        // TODO code application logic here
    }
    
}
