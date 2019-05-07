package ejercicio3;

import javax.swing.JOptionPane;


public class Ejercicio3 {

    
    public static void main(String[] args) {
        String [] alumnos = new String[10];
        double []  notas = new double[10];
        String [] calificaciones = {"Insuficiente", "Bien", "Notable", "Sobresaliente"};
        String resultados = "";
        
        for(int x = 0; x < alumnos.length; x++){
            alumnos[x] = JOptionPane.showInputDialog("Introduce el nombre del alumno");
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota que ha sacado el alumno"));
            notas[x] = nota;
            
            String calificacion = "";
            if (nota < 5){
                calificacion = calificaciones[0];
            }
            if(nota >= 5 && nota < 7){
                calificacion = calificaciones[1];
            }
            if(nota >= 7 && nota < 9){
                calificacion = calificaciones[2];
            }
            if(nota > 9){
                calificacion = calificaciones[3];
            }
            
            resultados = resultados + alumnos[x] + ": " + calificacion + "\n";
        }
        JOptionPane.showMessageDialog(null, resultados);
    }
    
}
