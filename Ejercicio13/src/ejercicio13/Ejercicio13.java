/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw12
 */
public class Ejercicio13 {
    static int contadorChicos = 0;
    static int contadorChicas = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int contador = 0;
        do
        {
        JOptionPane.showMessageDialog(null, "Teclea los datos del alumno");
        String nombre = JOptionPane.showInputDialog("Teclea el nombre");    
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Teclea la edad"));
        String genero = JOptionPane.showInputDialog("¿ Es chico o chica?");
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Teclea el peso")); 
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Teclea la altura"));
        aptoNoApto(peso, genero, altura);
        contador ++;
        
        }
        while (contador != 30);
        JOptionPane.showMessageDialog(null, "el numero de chicos aptos es de " + contadorChicos + " y el de chicas es de " + contadorChicas);
        // TODO code application logic here
    }
    
    public static void aptoNoApto(float peso, String genero, float altura){
        if (genero.equalsIgnoreCase("chica")){
            if (altura>1.6 && peso>60){
                contadorChicas = contadorChicas + 1;
            }   
        } else
            if (altura>1.7 && peso>70){
                contadorChicos = contadorChicos + 1;
            }
    }
}
