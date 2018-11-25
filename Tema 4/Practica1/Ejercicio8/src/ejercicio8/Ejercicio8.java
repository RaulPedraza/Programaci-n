package ejercicio8;

import javax.swing.JOptionPane;


public class Ejercicio8 {
    
    public static void main(String[] args) {
        //Creacion de Arrays y variables
        int matrizes [][] = new int [10][10];
        int sumas [] = new int [10];
        String mensajeFinal = "";
        int continuar;
        
        //Repetitiba para asignar las posiones en la matriz
        do{
        int fila = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de la fila"));
        int columna = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de la columna"));
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero para esa posicion"));
        //posicionar el numero donde nos han indicado
        matrizes [fila - 1][columna - 1] = numero;
        //continuar¿?
        continuar = JOptionPane.showConfirmDialog(null, "Quieres continuar?");
        }while(continuar == 0);
        //Llmamamos a la funcion sumar para que sume los numeros que nos han introducido
        sumar(matrizes, sumas);
        //Creamos el mensaje final que aparecera en pantalla
        for (int x = 0; x<sumas.length;x++){
            mensajeFinal = mensajeFinal + "Fila " + (x+1) + "=" + sumas[x] + "\n";
        }
        //Mostrar mensaje final
        JOptionPane.showMessageDialog(null, mensajeFinal);
    }
    //Funcion sumar
    public static void sumar(int matrizes [][], int sumas []){
        for(int x = 0; x < matrizes.length; x++){
            for(int y = 0; y < matrizes[x].length; y++){
                sumas[x] += matrizes[x][y];
            }
        }
    }
}
    
