/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

    import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw12
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota del 0 al 10 (ambos incluidos)"));
        //proceso
        if (nota>=0 && nota<=10){
            if (nota<5){
                JOptionPane.showMessageDialog(null, "Has suspendido");
            
            } else
                JOptionPane.showMessageDialog(null, "Has aprobado");
        } else
            JOptionPane.showMessageDialog(null, "La nota introducida no es correcta");
        // TODO code application logic here
    }
    
}
