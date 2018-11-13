/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw12
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String meses [] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio","agosto", "septiembre", "octubre", "novienbre", "diciembre"};
        String mes = JOptionPane.showInputDialog("Introduce un mes");
        int correcto = 0;
        for(int x = 0; x<meses.length;x++){
            if (meses[x].equalsIgnoreCase(mes)){
                JOptionPane.showMessageDialog(null, "el mes introducido es correcto");
                correcto++;
            }
        }
        if (correcto == 0){
                JOptionPane.showMessageDialog(null, "El mes introducido no es correcto");
        }
    }
    
    
}
