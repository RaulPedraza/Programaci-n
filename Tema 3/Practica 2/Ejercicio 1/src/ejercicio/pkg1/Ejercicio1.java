/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

import javax.swing.JOptionPane;


/**
 *
 * @author 1gdaw12
 */
public class Ejercicio1 {
    
    private static byte horasTrabajadas;
    private static byte estadoCivil;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        solicitarDatos();
    }
    
    public static void solicitarDatos(){
        try {
            horasTrabajadas = Byte.parseByte(JOptionPane.showInputDialog("Teclea el numero de horas trabajadas"));
            estadoCivil = JOptionPane.showInputDialog("Teclea el estado civil del trabajador")  .charAt(0);
            estadoCivil = Character.toUpperCase(estadoCivil);
        
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El dato tecleado no es del tipo que se pide");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
        }
    }
}
