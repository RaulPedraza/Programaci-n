/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import javax.swing.JOptionPane;


/**
 *
 * @author 1gdaw12
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion y creacion del array
        float [] numeros = new float[10];
        //Repetitiva para introducir los 10 numeros
        try
        {
        for (int x=0; x<numeros.length;x++){
            numeros [x] = Float.parseFloat(JOptionPane.showInputDialog("Introduce un numero para la posicion " + x));
        }
        //Mostrar los numero del array
        for (float elemento: numeros){
            JOptionPane.showMessageDialog(null, elemento);
        }
        //crear las variables de MAXIMO y MINIMO
        float valorMinimo = numeros[0];
        float valorMaximo = numeros[0];
        //Repetitiva para comprobar el maximo y el minimo
        for (int x = 1; x<numeros.length; x++){
            if (numeros[x]<valorMinimo){
                valorMinimo = numeros[x];
            }
            if (numeros[x]>valorMaximo){
                valorMaximo = numeros[x];
            }
        }
        JOptionPane.showMessageDialog(null, "El valor maximo del array es " + valorMaximo + " y el valor minimo es " + valorMinimo);
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El valor introducido no es un numero");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
        }
    }
    
}
