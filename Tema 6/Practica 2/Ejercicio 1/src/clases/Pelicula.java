/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


public class Pelicula {
    private String titulo;
    private char año;
    private float duracion;
    private String tipo;
    
    private Arraylist<Estudio> listaEstudios;

    public Pelicula(String titulo, char año, float duracion, String tipo) {
        this.titulo = titulo;
        this.año = año;
        this.duracion = duracion;
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public char getAño() {
        return año;
    }

    public void setAño(char año) {
        this.año = año;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }
    public void nuevapelicula(){
        
    }
    public void modificarPelicula(){
        
    }
    public void despliegaPelicula(){
        
    }
    public void eliminaPelicula(){
        
    }
}
