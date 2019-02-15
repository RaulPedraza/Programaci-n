package Clases;

public class Empleado {

    private String dni;
    private int nss;
    private String nombreApellidos;
    private String direccion;
    private int telefono;
    private char sexo;
    private char estadoCivil;
    private int numEmpleado;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNss() {
        return nss;
    }

    public void setNss(int nss) {
        this.nss = nss;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public char isSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char isEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(char estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public Empleado(String dni, int nss, String nombreApellidos, String direccion, int telefono, boolean sexo, boolean estadoCivil, int numEmpleado) {
        this.dni = dni;
        this.nss = nss;
        this.nombreApellidos = nombreApellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.numEmpleado = numEmpleado;
    }

    public Empleado() {
    }
}
