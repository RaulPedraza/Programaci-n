
package UML;

import java.util.ArrayList;


public class Persona {
    private String nombre;
    private String dni;
    private String apellido;
    private String telefono;
    
    //Relacion con la tabla Empresas
    private Empresa e; 
    
    //Relacion con la tabla Eventos
    private ArrayList<Evento> listaEventos;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Empresa getE() {
        return e;
    }

    public void setE(Empresa e) {
        this.e = e;
    }

    public ArrayList<Evento> getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(ArrayList<Evento> listaEventos) {
        this.listaEventos = listaEventos;
    }

    public Persona() {
    }

    public Persona(String nombre, String dni, String apellido, String telefono, Empresa e, ArrayList<Evento> listaEventos) {
        this.nombre = nombre;
        this.dni = dni;
        this.apellido = apellido;
        this.telefono = telefono;
        this.e = e;
        this.listaEventos = listaEventos;
    }
    
}
