
package UML;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;


public class Evento {
    private String nombre;
    private String lugar;
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFinal;
    private int aforo;
    
    private ArrayList<Persona> listaPersonas;

    public Evento() {
    }

    public Evento(String nombre, String lugar, LocalDate fecha, LocalTime horaInicio, LocalTime horaFinal, int aforo) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.aforo = aforo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(LocalTime horaFinal) {
        this.horaFinal = horaFinal;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }
    
}
