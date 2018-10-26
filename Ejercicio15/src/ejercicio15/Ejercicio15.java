/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import javax.swing.JOptionPane;
/**
 *
 * @author 1gdaw12
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int contador = 0;
        int respuesta;
        //proceso
        do 
        {
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Teclea una nota"));
        if (nota>=6 ){
            contador ++;
            
        }
        respuesta = (JOptionPane.showConfirmDialog(null, nota, "¿Quieres continuar?", JOptionPane.YES_NO_OPTION));
        
        }
        while(respuesta==0);
        JOptionPane.showMessageDialog(null, "El numero de alumnos aprobados es de " + contador);
        // TODO code application logic here
    }
    
}
