package ejercicio9;


import java.util.regex.*;

import javax.swing.JOptionPane;

public class Ejercicio9 {

    public static void main(String[] args) {
        validarDNI();
        validarEmail();
        validarFecha();
        validarNombre();
        validarDireccion();
    }
    
    public static void validarDNI(){
        String dni = JOptionPane.showInputDialog("Introduce tu DNI:");
        Pattern patron = Pattern.compile("[0-9]{8}[A-Z]");
        Matcher encaja = patron.matcher(dni);
        if(encaja.matches()){
            JOptionPane.showMessageDialog(null, "El DNI esta bien");
        }else
            JOptionPane.showMessageDialog(null, "El DNI no esta bien");
    }
    
    public static void validarEmail(){
        String email = JOptionPane.showInputDialog("Introduce tu E-mail");
        Pattern patron = Pattern.compile("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z]+(\\.[a-z]+)*(\\.[a-z]{2,4})$");
        Matcher encaja = patron.matcher(email);
        if(encaja.matches()){
            JOptionPane.showMessageDialog(null, "El E-mail esta bien");
        }else
            JOptionPane.showMessageDialog(null, "El E-mail no esta bien");
    }
    
    public static void validarFecha(){
        String fecha = JOptionPane.showInputDialog("Introduce tu fecha de nacimiento");
        //LocalDate fechaNac = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        Pattern patron = Pattern.compile("^([0-2][0-9]|3[0-1])(\\/)(0[1-9]|1[0-2])\\2(\\d{4})$");
        Matcher encaja = patron.matcher(fecha);
        if(encaja.matches()){
            JOptionPane.showMessageDialog(null, "La fecha esta bien");
        }else
            JOptionPane.showMessageDialog(null, "La fecha no esta bien");
    }
    
    public static void validarNombre(){
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        Pattern patron = Pattern.compile("^([A-Z][a-z]+)(\\s)*([A-Z][a-z]+)*$");
        Matcher encaja = patron.matcher(nombre);
        if(encaja.matches()){
            JOptionPane.showMessageDialog(null, "El nombre esta bien");
        }else
            JOptionPane.showMessageDialog(null, "El nombre no esta bien");
    }
    
    public static void validarDireccion(){
        String direccion = JOptionPane.showInputDialog("Introduce tu direccion");
        Pattern patron = Pattern.compile("^([A-Z][a-z]+)(\\s[a-z][a-z]+)+(\\s[0-9]{1,3})(\\s[0-9]{1,2})(\\s)([A-E]|[CDI])(\\s[A-Z][a-z]+)(\\s[A-Z][a-z]+)(\\s[0-9]{5})");
        Matcher  encaja = patron.matcher(direccion);
        if(encaja.matches()){
            JOptionPane.showMessageDialog(null, "La direccion esta bien");
        }else
            JOptionPane.showMessageDialog(null, "La direccionno esta bien");
    }
}
