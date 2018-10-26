/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9.pkg2;

    import javax.swing.JOptionPane;
/**
 *
 * @author 1gdaw12
 */
public class Ejercicio92 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota del 0 al 10"));
        //proceso
        if (nota<=10 && nota>=0){
            tratarNota (nota);
        } else
            JOptionPane.showMessageDialog(null, "La nota introducida no es valida");
        // TODO code application logic here
    }
    
    public static void tratarNota (int nota){
        switch (nota)
        {
            case 0: case 1: case 2: case 3:
                JOptionPane.showMessageDialog(null, "Deficiente");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Insuficiente");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Suficiente");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Bien");
                break;
            case 7: case 8:
                JOptionPane.showMessageDialog(null, "Notable");
                break;
            case 9: case 10:
                JOptionPane.showMessageDialog(null, "Sobresaliente");
                break;
        }
            
    }
}
