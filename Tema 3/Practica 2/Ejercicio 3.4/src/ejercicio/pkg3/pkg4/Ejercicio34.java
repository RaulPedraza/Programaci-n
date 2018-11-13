/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3.pkg4;

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author 1gdaw12
 */
public class Ejercicio34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Establecer el formate de la fecha
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yy");
        //try catch para posibles fallos
        try {
            //crear y comvertir las variables
            String fechaUno = JOptionPane.showInputDialog("Teclea una fecha en formato dd/MM/yy");
            Date fecha1 = formater.parse(fechaUno);
            String fechaDos = JOptionPane.showInputDialog("Teclea otra fecha con el mismo formato");
            Date fecha2 = formater.parse(fechaDos);
            //Calcular la diferencia
            long milisegundos = fecha1.getTime() - fecha2.getTime();
            long diferencia = milisegundos / 86400000;
            JOptionPane.showMessageDialog(null, "Hay una diferencia de " + diferencia + " dias entre las dos fechas");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "El dato introducido no es valido");
        }
 
        
        
        // TODO code application logic here
    }
    
}
