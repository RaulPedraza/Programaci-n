/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw12
 */
public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mensaje = JOptionPane.showInputDialog("Introduce un mensaje");
        int contador = 0;
        for(int x=0;x<mensaje.length();x++){
            if (mensaje.charAt(x)=='a' || mensaje.charAt(x)=='e' || mensaje.charAt(x)=='i' || mensaje.charAt(x)=='o' || mensaje.charAt(x)=='u'){
                contador ++;
            } 
        }
        JOptionPane.showMessageDialog(null, "La palabra " + mensaje + " tiene " + contador + " vocales");
        // TODO code application logic here
    }
    
}
