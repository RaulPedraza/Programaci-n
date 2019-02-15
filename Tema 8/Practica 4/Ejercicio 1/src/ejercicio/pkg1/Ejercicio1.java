
package ejercicio.pkg1;

import Ventanas.VentanaDatos;
import Clases.Empleado;
import Clases.Usuario;
import Ventanas.VentanaInicioSesion;
import Ventanas.VentanaPrincipal;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio1 {
   
    private static ArrayList<Usuario> listaUsuarios;
    private static ArrayList<Empleado> listaEmpleados;
    private static VentanaDatos vd;
    private static VentanaInicioSesion vis;
    private static VentanaPrincipal vp;
    private static Usuario u;
    private static Empleado em;
    
    public static void main(String[] args) {
        generarUsuarios();
        vis = new VentanaInicioSesion();
        vis.setVisible(true);
    }
    
    public static void generarUsuarios(){
        listaUsuarios = new ArrayList<Usuario>();
        u = new Usuario ("usuario1","contraseña1");
        listaUsuarios.add(u);
        u = new Usuario ("usuario2","contraseña2");
        listaUsuarios.add(u);
        u = new Usuario ("usuario3","contraseña3");
        listaUsuarios.add(u);
        u = new Usuario ("usuario4","contraseña4");
        listaUsuarios.add(u);
    }
    
    public static boolean comprobarUsuario(String tfUsuario, String tfContraseña){
        boolean usuarioValido = false;
        int x;
        for (x = 0; x < listaUsuarios.size() &&  usuarioValido == false ;x++){
            if (listaUsuarios.get(x).getUsuario() != null){
                if (listaUsuarios.get(x).getUsuario().compareToIgnoreCase(tfUsuario) != 0){
                    usuarioValido = true;
                }
            }
        }
        return usuarioValido;
    }
    
    public static void abrirVentanaPrincipal (){
        vp = new VentanaPrincipal();
        vp.setVisible(true);
        vis.setVisible(false);
    }
          
    public static void darDeAlta(){
        vd = new VentanaDatos();
        vd.setVisible(true);
    }
    
    public static void crearEmpleado(String tfDNI, String tfNSS, String tfNombreApellido, String tfDireccion, String tfTelefono) {
        em = new Empleado ();
        em.setDni(tfDNI);
        em.setNombreApellidos(tfNombreApellido);
        em.setNss(Integer.parseInt(tfNSS));
        em.setDireccion(tfDireccion);
        em.setTelefono(Integer.parseInt(tfTelefono));
        JOptionPane.showMessageDialog(null, "El empleado ha sido dado de alta");
        vd.setVisible(false);
        listaEmpleados.add(em);
    }
    
    public static void cerrarVentanaDatos(){
        vd.setVisible(false);
    }
    
    public static void darDeBaja(){
        vd = new VentanaDatos();
        vd.setVisible (true);
        
    }
    public static void cerrarProyecto(){
        vis.dispose();
        System.exit(0);
    }
}
    