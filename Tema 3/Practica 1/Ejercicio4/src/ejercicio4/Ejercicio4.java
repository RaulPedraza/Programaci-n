/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

    import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw12
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        float D = Float.parseFloat(JOptionPane.showInputDialog("Introduce el valor de la diagonal grande"));
        float d = Float.parseFloat(JOptionPane.showInputDialog("Introduce el valor de la diagonal pequeña"));
        //proceso
        float respuesta = D * d / 2;
        //salida de respuesta
        JOptionPane.showMessageDialog(null, "Esta es el area del rombo " + respuesta);
        // TODO code application logic here
    }
    
}
