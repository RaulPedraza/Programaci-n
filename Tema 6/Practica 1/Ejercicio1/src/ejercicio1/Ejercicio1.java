
package ejercicio1;

import circunferencia.Circunferencia;
import javax.swing.JOptionPane;
public class Ejercicio1 {

        
    public static void main(String[] args) {
        float radio = 0;
        radio = Float.parseFloat(JOptionPane.showInputDialog("Introduce el radio de la circunferencia"));
        Circunferencia c1 = new Circunferencia();
        c1.setRadio(radio);
        c1.getArea();
        c1.getLongitud();
        
       JOptionPane.showMessageDialog(null, "La longitud = " + c1.getLongitud);º     
    }
    
}
