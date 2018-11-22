package ejercicio6;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ejercicio6 {

    public static void main(String[] args) {
        int [] dias = new int[5];
        int [] codigos = new int[5];
        int [] faltas = new int[5];
        
        asignarValor(dias, codigos, faltas);
        
        String valor = menu(dias, codigos, faltas); 
        JOptionPane.showMessageDialog(null, valor);         
    }
    
    public static void asignarValor(int[] dias, int[] codigos, int[] faltas){
        for(int i = 0; i < dias.length; i++){
            
            String codigo = JOptionPane.showInputDialog(null, "Introduce un codigo de alumno");
            int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un día"));
            int falta = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número de faltas"));
            
            if(!Arrays.toString(codigos).contains(codigo)){
                codigos[i] = Integer.parseInt(codigo);
                dias[i] = dia;
                faltas[i] = falta;
            }
        }
    }
    public static String menu(int[] dias, int[] codigos, int[] faltas){
        String valor = "";
        for(int i = 0; i < codigos.length; i++){
            valor += "Alumno: " + codigos[i] + "  Día: " + dias[i] + "  Faltas: " + faltas[i] +"\n";
        }
        return valor;
    }
}
