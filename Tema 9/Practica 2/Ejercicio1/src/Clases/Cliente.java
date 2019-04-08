
package Clases;

import java.util.ArrayList;


public class Cliente extends Persona{
    private String telefono;
    //Relacion con Casos
    private ArrayList<Caso> casos;

    public Cliente(String t, ArrayList<Caso> c, String dni, String n, String a, String d) {
        super(dni, n, a, d);
        this.telefono = t;
        this.casos = c;
    }

    public Cliente() {
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Caso> getCasos() {
        return casos;
    }

    public void setCasos(ArrayList<Caso> casos) {
        this.casos = casos;
    }
    
}
