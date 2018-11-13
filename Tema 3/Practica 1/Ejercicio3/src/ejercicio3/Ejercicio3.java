/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

    import javax.swing.JOptionPane;
/**
 *
 * @author 1gdaw12
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del rectangulo"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del rectangulo"));
        //proceso   
        int perimetro = 2 * base + 2 * altura;
        //salida de respuesta
        JOptionPane.showMessageDialog(null, "el perimetro del rectangulo es de " + perimetro);
        // TODO code application logic here
    }
    
}
