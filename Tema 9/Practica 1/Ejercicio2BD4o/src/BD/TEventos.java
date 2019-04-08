
package BD;

import Clases.Evento;
import com.db4o.*;


public class TEventos {
    private Evento ev;
    private ObjectContainer oc;

    public TEventos(ObjectContainer oc) {
        this.oc = oc;
    }
    
    public void darAlta(Evento ev){
        oc.store(ev);
    }
    
    public boolean buscarEvento(String nEvento){
        Evento ev = new Evento();
        ObjectSet listaEventos = oc.queryByExample(ev);
        
        while(listaEventos.hasNext()){
            ev = (Evento) listaEventos.next();
            if (ev.getNombre().equals(nEvento)){
                return true;
            }   
        }
        
        return false;
    }
    
    public void borrarEvento(String nEvento){
        ObjectSet resultado = oc.queryByExample(new Evento(nEvento,null,null,null,null,null,null)); 
        
        Evento found = (Evento) resultado.next();
        oc.delete(found);  
    }
    
    public boolean seleccionarEvento(String nEvento){
        ev = new Evento();
        ObjectSet listaEventos = oc.queryByExample(ev);
        
        while(listaEventos.hasNext()){
            ev = (Evento) listaEventos.next();
            if (ev.getNombre().equals(nEvento)){
                return true;
            }   
        }
        return false;
    }
    
    public Evento encontrarEvento(Evento eve)throws Exception{
        ObjectSet resultado = oc.queryByExample(eve);
      
            if (resultado.hasNext()){
                ev = (Evento) resultado.next();
            }
        
        return ev;
    }
    public void modificar(Evento evento)throws Exception{
        oc.store(evento);
    }
}
