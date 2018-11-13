/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

import javax.swing.JOptionPane;
import Excepcion.*;

/**
 *
 * @author 1gdaw12
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean repetir = true;
        do
        {
        try
        {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("1.-Sumar dos numeros \n"
                + "2.-Resta dos numeros \n"
                + "3.-Visualizar la tabla de multiplicar de un numero \n"
                + "4.-Visulizar el cociente y el resto de una division \n"
                + "5.-Salir del programa\n \n"
                + "Elige una opcion:"));
        if (numero>5 || numero<1){
            throw new NumeroNoValido();
        }
        switch (numero)
        {
            case 1:
                sumarNumeros();
                break;
            case 2:
                restarNumeros();
                break;
            case 3:
                tablaMultiplicar();
                break;
            case 4:
                dividirNumero();
                break;
            case 5:
                repetir = false;
        }
        }
        catch(NumeroNoValido e){
            JOptionPane.showMessageDialog(null, "Este numero no corresponde a ninguna de la opciones");
        }
        catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "El valor introducido no es apropiado");
        }
        catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Con los numero introducidos no se puede calcular la operacion");
        }
        catch(NullPointerException | StringIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Si quieres cerrar el programa debes introducir el numero 5");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
        }
        }
        while (repetir == true);
    }
    
    public static void sumarNumeros () throws Exception
    {
        int suma;
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro numero"));
        suma = numero1 + numero2;
        JOptionPane.showMessageDialog(null, numero1 + " + " + numero2 + " = " + suma);
    }
    
    public static void restarNumeros ()throws Exception
    {
        int resta;
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro numero"));
        resta = numero1 - numero2;
        JOptionPane.showMessageDialog(null, numero1 + " - " + numero2 + " = " + resta);
    }
    
    public static void tablaMultiplicar ()throws Exception
    {
        String tabla = "";
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        for (int x = 0; x<11; x++)
        tabla = tabla + numero + " * "  + x + " = " + (numero * x) + "\n";
        JOptionPane.showMessageDialog(null, tabla);
        
    }
    
    public static void dividirNumero ()throws Exception
    {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro numero"));
        int division;
        int resto;
        division = numero1 / numero2;
        resto = numero1 % numero2;
        JOptionPane.showMessageDialog(null, numero1 + " / " + numero2 + " = " + division + " resto: " + resto);
    }
}