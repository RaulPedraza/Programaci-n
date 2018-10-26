/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw12
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables 
        int contador = 0;
        int sumaDeEdades = 0;
        int respuesta;
        int edad;
        //procesos
        do
        {
        edad = Integer.parseInt(JOptionPane.showInputDialog("Teclea una edad"));
        contador ++;
        sumaDeEdades = sumaDeEdades + edad;
        respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres continuar?", "Selecciona una Opción",  JOptionPane.YES_NO_OPTION);
        }
        while (respuesta==0);
        JOptionPane.showMessageDialog(null, "El promedio de edad de la clase es de " + (sumaDeEdades/contador));
        // TODO code application logic here
    }    
}