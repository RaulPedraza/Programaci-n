package ejercicio8;

import javax.swing.JOptionPane;


public class Ejercicio8 {
    
    public static void main(String[] args) {
        int matriz [][] = new int [10][10];
        int suma [] = new int [10];
        
        int continuar;
        
        do{
        int fila = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el numero de fila"));
        int columna = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el numero de columna"));
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un valor para esa posicion"));
        
        matriz [fila - 1][columna - 1] = valor;
        
        continuar = JOptionPane.showConfirmDialog(null, "Quieres introducir más datos?");
        }while(continuar == 0);
        
        sumar(matriz, suma);
                
        JOptionPane.showMessageDialog(null, "Fila 1: " + suma[0] 
                                        + "\nFila 2: " + suma[1]
                                        + "\nFila 3: " + suma[2]
                                        + "\nFila 4: " + suma[3]
                                        + "\nFila 5: " + suma[4]
                                        + "\nFila 6: " + suma[5]
                                        + "\nFila 7: " + suma[6]
                                        + "\nFila 8: " + suma[7]
                                        + "\nFila 9: " + suma[8]
                                        + "\nFila 10: " + suma[9]);
    }
    
    public static void sumar(int matriz [][], int suma []){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                suma[i] += matriz[i][j];
            }
        }
    }
}
    
