/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw05
 */
public class Persona {
    private String nombre;
    private String dni;
    private String apellido;
    private String telefono;
    
    //Relacion con la tabla Empresas
    private Empresa empresa; 
    
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

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setE(Empresa empresa) {
        this.empresa = empresa;
    }

    public ArrayList<Evento> getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(ArrayList<Evento> listaEventos) {
        this.listaEventos = listaEventos;
    }

    public Persona() {
    }

    public Persona(String nombre, String dni, String apellido, String telefono, Empresa empresa, ArrayList<Evento> listaEventos) {
        this.nombre = nombre;
        this.dni = dni;
        this.apellido = apellido;
        this.telefono = telefono;
        this.empresa = empresa;
        this.listaEventos = listaEventos;
    }
    
}


