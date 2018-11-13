/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw12
 */
public class Ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mensaje = JOptionPane.showInputDialog("Introduce un mesaje");
        char caracter = (JOptionPane.showInputDialog("Introduce una letra").charAt(0));
        int contador = 0;
        for (int x=0;x<mensaje.length();x++){
            if (mensaje.charAt(x)== caracter){
                contador ++;
            }
            
        }
        JOptionPane.showMessageDialog(null, "la letra " + caracter + " aparece " + contador + " veces en " + mensaje);
        // TODO code application logic here
    }
    
}
