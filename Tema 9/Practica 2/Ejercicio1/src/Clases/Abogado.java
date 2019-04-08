
package Clases;

import java.util.ArrayList;


public class Abogado extends Persona{
    private ArrayList<Caso> ListaCasos;

    public Abogado() {
    }

    public Abogado(ArrayList<Caso> ListaCasos, String dni, String n, String a, String d) {
        super(dni, n, a, d);
        this.ListaCasos = ListaCasos;
    }

    public ArrayList<Caso> getListaCasos() {
        return ListaCasos;
    }

    public void setListaCasos(ArrayList<Caso> ListaCasos) {
        this.ListaCasos = ListaCasos;
    }
    
}
