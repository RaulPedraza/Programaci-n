package ejercicio2;

import javax.swing.JOptionPane;


public class Ejercicio2 {

    
    public static void main(String[] args) {
        char [] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        String cadena = "";
        int posicion = 0;
        
        while(posicion != -1){
            posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion de la letra que quieres. \n" + "Para terminar pon -1."));
            if (posicion != -1){
                char letra = letras[posicion - 1];
                cadena = cadena + letra;
            }
        }

        JOptionPane.showMessageDialog(null, cadena);
       
        
    }
    
}
