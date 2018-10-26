/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import javax.swing.JOptionPane;
/**
 *
 * @author 1gdaw12
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Teclea un numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Teclea un segundo numero"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un ultimo numero"));
        //proceso
        if (n1>n2 && n1>n3){
            JOptionPane.showMessageDialog(null, n1 + " es el mas grande");
            if (n2>n3){
                JOptionPane.showMessageDialog(null, n3 + " es el mas pequeño");
            } else 
                JOptionPane.showMessageDialog(null, n2 + " es el mas pequeño");
        } else
            if (n2>n3){
                JOptionPane.showMessageDialog(null, n2 + " es el mas grande");
                if (n1>n3){
                    JOptionPane.showMessageDialog(null, n3 + " es el mas pequeño");
                } else
                    JOptionPane.showMessageDialog(null, n1 + " es el mas pequeño");
            } else{ 
                JOptionPane.showMessageDialog(null, n3 + " es el mas grande");
                if (n1>n2){
                    JOptionPane.showMessageDialog(null, n2 + " es el mas pequeño");
                } else
                    JOptionPane.showMessageDialog(null, n1 + " es el mas pequeño");
            }        
        
        
        // TODO code application logic here
    }
    
}
