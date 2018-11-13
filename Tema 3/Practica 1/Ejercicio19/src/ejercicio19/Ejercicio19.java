/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw12
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int contador = 0;
        int nrImpar = 1;
        int resultado = 0;
        //proceso
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Teclea el número"));
        while(contador<numero){
            resultado = calcularResultado(resultado, nrImpar);
            nrImpar = siguienteImpar(nrImpar);
            contador ++;
        }
        JOptionPane.showMessageDialog(null, "El cuadrado de " + numero + " es " + resultado);
        // TODO code application logic here
    }
    private static int calcularResultado(int resultado, int nrImpar){
        resultado = resultado + nrImpar;
        return resultado;
    }
    private static int siguienteImpar(int nrImpar){
        nrImpar =   nrImpar + 2;
        return nrImpar;
    }
}
