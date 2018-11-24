package ejercicio6;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ejercicio6 {

    public static void main(String[] args) {
        //creacion de Arrays
        int [] dias = new int[5];
        int [] codigos = new int[5];
        int [] faltas = new int[5];
        int continuar = 0;
        String tabla = "";
        String mensajeFinal = "";
        do
        {
            //Repetitiba para establecer los valores de la tabla de faltas
            for(int x = 0; x < 5; x++){
                String codigo = JOptionPane.showInputDialog(null, "Introduce un codigo de alumno");
                int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un día"));
                int falta = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número de faltas"));
            
                if(!Arrays.toString(codigos).contains(codigo)){
                    codigos[x] = Integer.parseInt(codigo);
                    dias[x] = dia;
                    faltas[x] = falta; 
                }   
            }
            //Creacion de la tabla
            for (int x = 0; x<codigos.length;x++){
               tabla = tabla + "El alumno con el codigo " + codigos[x] + " tiene " + faltas[x] + " faltas el dia " + dias[x] + "\n"; 
            }
            //continuar¿?
            continuar = JOptionPane.showConfirmDialog(null, "¿Quieres continuar?");
            //si quiere continuar vamos a almacenar la tabla que tenemos para no perderla
            mensajeFinal = mensajeFinal + "\n" + tabla;
            if (continuar == 0){
               tabla = "";
            }
        }
        while (continuar == 0);
        //Salida del mensaje final
        JOptionPane.showMessageDialog(null, mensajeFinal);
    }
}
