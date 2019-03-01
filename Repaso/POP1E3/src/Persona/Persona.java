
package Persona;

import java.util.Date;


public class Persona {
    private String nombre;
    private Date fecNac;
    private String direccion;
    private int cp;
    private String ciudad;

    public Persona() {
    }

    public Persona(String nombre, Date fecNac, String direccion, int cp, String ciudad) {
        this.nombre = nombre;
        this.fecNac = fecNac;
        this.direccion = direccion;
        this.cp = cp;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecNac() {
        return fecNac;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
}
