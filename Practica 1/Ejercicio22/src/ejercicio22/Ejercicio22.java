/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio22;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw12
 */
public class Ejercicio22 {
    public static int resto;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int ultimoNumero = Integer.parseInt(JOptionPane.showInputDialog("Teclea un numero"));
        int numero = 1;
        //proceso
        do
        {
            funcionPrimo(numero, ultimoNumero);
            numero = numero + 1;   
        }
        while (numero<=ultimoNumero);        
    }
    public static void funcionPrimo (int numero, int ultimoNumero){
        //Comprobar si es 1, 2 o 3
        if (numero<4)
        {
            JOptionPane.showMessageDialog(null, numero + " SI es un numero primo");
        }else 
        //Calcular los numero primos
        {
        //Calcular el resto 
            int divisor = numero;
            do
            {
            divisor = divisor - 1;
            resto = numero % divisor;
            }
            while (resto != 0 && divisor>2);
        if (resto == 0)
        {
            JOptionPane.showMessageDialog(null, numero + " NO es un numero pirmo");
        }else
            JOptionPane.showMessageDialog(null, numero + " SI es un numero primo");
        }
    }
}   
