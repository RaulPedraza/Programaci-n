package BD;

import Clases.*;
import com.db4o.*;
import com.db4o.config.Configuration;

public class BaseDatos {
    private ObjectContainer oc;
    
    public BaseDatos() throws Exception{
        Configuration configuracion = Db4o.newConfiguration();
        configuracion.objectClass(Evento.class).updateDepth(50);
        configuracion.objectClass(Persona.class).updateDepth(50);
        configuracion.objectClass(Empresa.class).updateDepth(50);
        oc = Db4o.openFile("EventosBD");
    }
    
    public void cerrarCon(){
        oc.close();
    }
    public ObjectContainer Conectar(){
        return oc;
    }
    
    
}
