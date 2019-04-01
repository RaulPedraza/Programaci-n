package BD;

import com.db4o.*;

public class BaseDatos {
    private ObjectContainer oc;
    
    public BaseDatos() throws Exception{
        oc = Db4o.openFile("EventosBD");
    }
    
    public void cerrarCon(){
        oc.close();
    }
    public ObjectContainer Conectar(){
        return oc;
    }
    
    
}
