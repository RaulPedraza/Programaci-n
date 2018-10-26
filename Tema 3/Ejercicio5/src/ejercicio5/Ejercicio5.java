/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

    import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw12
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        double gradosC = Double.parseDouble(JOptionPane.showInputDialog("Introduce los grados centrigrados"));
        //calculos
        double gradosF = 1.8 * gradosC + 32;
        //muestra de respuesta
        JOptionPane.showMessageDialog(null, gradosC + "ºC son " +  gradosF + "ºF");
        // TODO code application logic here
    }
    
}
