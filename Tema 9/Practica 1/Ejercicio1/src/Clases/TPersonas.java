
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class TPersonas {
    private static Connection con;

    public TPersonas(Connection con) {
        this.con = con;
    }

    public static void darAlta(Persona p){
        try {
            Statement sentencia = con.createStatement();
            
            String plantilla = "insert into personas values (?,?,?,?);";
            PreparedStatement ps = con.prepareStatement(plantilla);
            ps.setString(1, p.getNombre());
            ps.setInt(2, p.getEdad());
            ps.setString(3, p.getProfesion());
            ps.setString(4, p.getTelefono());
            int n = ps.executeUpdate();
            if(n != 1)
                JOptionPane.showMessageDialog(null, "Cero filas actualizadas");
            
        }
        catch (Exception e){
            
        }
    }
    
    public Persona buscarNombre (String nombre){ 
        Persona p = null;
        try{
            
            String plantilla = "select * from personas where nombre = ?;";
            PreparedStatement ps = con.prepareStatement(plantilla);
            ps.setString(1, nombre);
            ResultSet resultado = ps.executeQuery();
            if (resultado.next()){
                p = new Persona();
                p.setNombre(resultado.getString("nombre"));
                p.setEdad(Integer.parseInt(resultado.getString("edad")));
                p.setProfesion(resultado.getString("profesion"));
                p.setTelefono(resultado.getString("Telefono"));
                
            }else
                throw new Exception ("Persona no encontrada");
            
            resultado.close();
            ps.close();
        }
        catch (Exception e){
            return null;
        }
        return p;
    }
    
    public ArrayList<Persona> consultarPersonas(){
        ArrayList<Persona> listaPersonas = new ArrayList();
        try{
            
            String plantilla = "select * from personas";
            PreparedStatement ps = con.prepareStatement(plantilla);
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()){
                Persona p = new Persona();
                p.setNombre(resultado.getString("nombre"));
                p.setEdad(Integer.parseInt(resultado.getString("edad")));
                p.setProfesion(resultado.getString("profesion"));
                p.setTelefono(resultado.getString("Telefono"));
                listaPersonas.add(p);
            }    
            
            resultado.close();
            ps.close();
        }
        catch (Exception e){
            return null;
        }
        return listaPersonas;
    }
}
