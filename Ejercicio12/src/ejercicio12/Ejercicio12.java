/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw12
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        float consumo = Float.parseFloat(JOptionPane.showInputDialog("Teclea el consumo mensual"));
        float importe;
        //proceso
        if (consumo>300){
            if (consumo>500){
                importe = 300 * 0.03f + (consumo - 300) * 0.02f;
                if (consumo>800){
                    importe = importe - (importe * 1.25f / 100);
                }    
            } else
                importe = consumo * 0.03f;  
        } else
            importe = consumo * 0.04f;
        JOptionPane.showMessageDialog(null, "El importe total es de: " + importe);
        // TODO code application logic here
    }
    
}
