package ejercicio.pkg6;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Ejercicio6 {

    
    public static void main(String[] args) {
        ArrayList<String> listaValores = new ArrayList();
        String cadena = "";
        for(int x = 0; x < 3; x++){
           String valor = JOptionPane.showInputDialog("Introduce una letra");
           listaValores.add(valor);
        }
        
        for(int i = 2; i > -1;i--){
            String valor = listaValores.get(i);
            cadena += valor + " ";
        }
        
        JOptionPane.showMessageDialog(null, cadena);
    }
    
}
