/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

    import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw12
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        float radio = Float.parseFloat(JOptionPane.showInputDialog("Introduce el radio de la cirucnferencia"));
        //calculos
        double area = Math.PI * radio * radio;
        //solucion
        JOptionPane.showMessageDialog(null, "El area de la circuferencia es de " + area);
        // TODO code application logic here
    }
    
}
