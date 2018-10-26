/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

    import javax.swing.JOptionPane;


/**
 *
 * @author 1gdaw12
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Intruduce la nota del 0 al 10"));
        //proceso
        if (nota>=0 && nota<=10){
            tratarNota(nota);
        } else 
            JOptionPane.showMessageDialog(null, "La nota no es valida");
        // TODO code application logic here
    }
    
    public static void tratarNota(int nota){
        if (nota<5){
            if (nota<4){
                JOptionPane.showMessageDialog(null, "Deficiente");
            } else 
                JOptionPane.showMessageDialog(null, "Insuficiente");
         } else 
            if (nota<7){
                if (nota<6){
                    JOptionPane.showMessageDialog(null, "Suficiente");
                } else 
                    JOptionPane.showMessageDialog(null, "Bien");
            } else
                if (nota<9){
                    JOptionPane.showMessageDialog(null, "Notable");
                } else
                    JOptionPane.showMessageDialog(null, "Sobresaliente");
            
            
               
    }
    
}
