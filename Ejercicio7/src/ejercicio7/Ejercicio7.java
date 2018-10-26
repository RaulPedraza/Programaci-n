/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

    import javax.swing.JOptionPane;
/**
 *
 * @author 1gdaw12
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables 
        float c1 = Float.parseFloat(JOptionPane.showInputDialog("Introduce el valor de uno de los catetos"));
        float c2 = Float.parseFloat(JOptionPane.showInputDialog("Introduce el valor del segundo cateto"));
        //calculo
        double hipotenusa = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
        //solucion
        JOptionPane.showMessageDialog(null, "El valor de la hipotenusa es de " + hipotenusa);
        // TODO code application logic here
    }
    
}
