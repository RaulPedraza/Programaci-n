/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw12
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int repetir;
        try {
        do
        {
        int sql = JOptionPane.showConfirmDialog(null, "¿Es apto en SQL?", null, JOptionPane.YES_NO_OPTION);
        int visual = JOptionPane.showConfirmDialog(null, "¿Es apto en Visual.Net?", null, JOptionPane.YES_NO_OPTION);
        int java = JOptionPane.showConfirmDialog(null, "¿Es apto en Java?", null, JOptionPane.YES_NO_OPTION);
        int cobol = JOptionPane.showConfirmDialog(null, "¿Es apto en Cobol?", null, JOptionPane.YES_NO_OPTION);
        //sacar nota
        if (sql == 0 && visual == 0 && java == 0 && cobol == 0) {
            JOptionPane.showMessageDialog(null,"Sobresaliente");
        }else
            if (sql == 0 && cobol == 0 && (java == 0 || visual == 0)){
                JOptionPane.showMessageDialog(null, "Notable");
            }else 
                if (sql == 0 && cobol == 0) {
                    JOptionPane.showMessageDialog(null, "Bien");
                }else
                    if (sql == 0 || cobol == 0 && (java == 0 || visual == 0)){
                        JOptionPane.showMessageDialog(null, "Suficiente");
                    }else
                        JOptionPane.showMessageDialog(null, "Insuficiente");
        
        repetir = JOptionPane.showConfirmDialog(null, "¿Quieres Continuar con otro alumno?", null, JOptionPane.YES_NO_OPTION);
        }
        while (repetir == 0);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "ha ocurrido un erro");
        }
    }
}
