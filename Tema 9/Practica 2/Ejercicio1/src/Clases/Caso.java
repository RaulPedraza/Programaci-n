
package Clases;

import java.time.LocalDate;
import java.util.ArrayList;


public class Caso {
    private Integer nExpediente;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String estado;
    //Relacion con Cliente
    private Cliente c;
    //Relacion con Abogado
    private ArrayList<Abogado> Abogados;

    public Caso() {
    }

    public Caso(Integer nExpediente, LocalDate fechaInicio, Cliente c) {
        this.nExpediente = nExpediente;
        this.fechaInicio = fechaInicio;
        this.c = c;

    }

    public Integer getnExpediente() {
        return nExpediente;
    }

    public void setnExpediente(Integer nExpediente) {
        this.nExpediente = nExpediente;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }

    public ArrayList<Abogado> getAbogados() {
        return Abogados;
    }

    public void setAbogados(ArrayList<Abogado> Abogados) {
        this.Abogados = Abogados;
    }
    
}
