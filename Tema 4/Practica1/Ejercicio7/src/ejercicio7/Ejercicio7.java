package ejercicio7;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        int [] codigos = {10, 23, 30, 47, 55, 65, 135, 256, 526, 663};
        int [] ventas = new int[10];
        int continuar = 0;
        
        do
        {
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el codigo del producto que se ha comprado"));
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad que se ha comprado de ese producto"));
            /*NO SE COMO POSIONAR LA CANTIDAD QUE SE HA COMPRADO EN EL MISMO LUGAR DE QUE ESTA EL CODIGO 
            Y LUEGO COMO NO LOS TENGO POSICIONADOS BIEN A LA HORA DE ORNEDAR NO ME VA  A SALIR BIEN
            */
            JOptionPane.showConfirmDialog(null, "¿Quieres continuar?");
        }
        while(continuar ==0);
    }
    
}
