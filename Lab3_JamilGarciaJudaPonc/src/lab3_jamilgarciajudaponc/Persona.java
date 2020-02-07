package lab3_jamilgarciajudaponc;

public class Persona {

    private String nombre;
    private String apellido;
    private int anios;
    private double salario;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int anios, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.anios = anios;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getAnios() {
        return anios;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", anios=" + anios + ", salario=" + salario + '}';
    }

    
    
}
