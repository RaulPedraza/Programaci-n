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
        //Variables
        String N1,N2;
        //Datos
        N1 = JOptionPane.showInputDialog("Introduce un numero");
        int numero1 = Integer.parseInt(N1);
        N2 = JOptionPane.showInputDialog("Introduce otro numero");
        int numero2 = Integer.parseInt(N2);
        //Proceso
        int resultado = numero1 * numero2;
        JOptionPane.showMessageDialog(null, resultado);
        
        // TODO code application logic here
    }
    
}
