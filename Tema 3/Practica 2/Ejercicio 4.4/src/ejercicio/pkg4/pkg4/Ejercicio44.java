/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4.pkg4;

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author 1gdaw12
 */
public class Ejercicio44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dia"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes"));
        int año = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año"));
        //formato de fecha
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        JOptionPane.showm
    }
    
}
