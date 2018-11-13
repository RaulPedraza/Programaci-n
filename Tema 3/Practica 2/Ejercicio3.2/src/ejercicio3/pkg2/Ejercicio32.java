/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw12
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mensaje = JOptionPane.showInputDialog("Introduce un mensaje");
        String mensajeInvertido = "";
        for (int x=mensaje.length()-1;x>=0;x--)
            mensajeInvertido = mensajeInvertido + mensaje.charAt(x);
    }
        JOptionPane.showMessageDialog(null, mensajeInvertido);
        // TODO code application logic here
    }
    
}
