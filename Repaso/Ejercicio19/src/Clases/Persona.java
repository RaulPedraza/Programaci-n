package Clases;


public class Persona {
    private String dni;
    private String apellidos;
    private String nombre;
    private String sexo;
    private Integer edad;
    private Integer peso;

    public Persona(String dni, String apellidos, String nombre, String sexo, Integer edad, Integer peso) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    public Persona() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", apellidos=" + apellidos + ", nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + '}';
    }
}
