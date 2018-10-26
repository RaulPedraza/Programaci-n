/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw12
 */
public class Ejercicio21 {
    public static int resto;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Teclea un numero"));
        int divisor = numero;
        //proceso
        if (numero == 2)
        {
            JOptionPane.showMessageDialog(null, "El numero tecleado SI es un numero primo");
        }else
            comprobarPrimo (divisor, numero); 
    }
    //Mirar si es numero es primo
    public static void comprobarPrimo (int divisor, int numero){
         do
            {
                divisor = calcularResto(divisor, numero);
            }
            while (resto != 0 && divisor>2);
            if (resto == 0)
            {
                JOptionPane.showMessageDialog(null, "El numero tecleado NO es un numero primo");
            }else
                JOptionPane.showMessageDialog(null, "El numero tecleado SI es un numero primo");
    }
    //Calcular el resto
    public static int calcularResto( int divisor, int numero){
        divisor = divisor - 1;
        resto = numero % divisor;
        return divisor;
    }   
}
