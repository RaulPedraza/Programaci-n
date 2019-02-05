
package clases;

<<<<<<< HEAD

public class Pelicula {
    private String titulo;
    private char año;
    private float duracion;
    private String tipo;
    
    private Arraylist<Estudio> listaEstudios;
=======
import java.util.ArrayList;

public class Pelicula {
    public String titulo;
    public char año[];
    public float duracion;
    public String tipo;
    
    private ArrayList<Estudio>lista;
>>>>>>> master

    public Pelicula(String titulo, char[] año, float duracion, String tipo) {
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

    public char[] getAño() {
        return año;
    }

    public void setAño(char[] año) {
        this.año = año;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }
<<<<<<< HEAD
    public void nuevapelicula(){
        
    }
    public void modificarPelicula(){
        
    }
    public void despliegaPelicula(){
        
    }
    public void eliminaPelicula(){
        
=======

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String clasificacion) {
        this.tipo = clasificacion;
    }

    public ArrayList<Estudio> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Estudio> lista) {
        this.lista = lista;
>>>>>>> master
    }
}
