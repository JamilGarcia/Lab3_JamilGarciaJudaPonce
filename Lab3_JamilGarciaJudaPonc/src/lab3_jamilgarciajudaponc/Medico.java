package lab3_jamilgarciajudaponc;

public class Medico extends Persona{
    
    private String colegio;

    public Medico() {
        super();
    }

    public Medico(String colegio, String nombre, String apellido, int anios, double salario) {
        super(nombre, apellido, anios, salario);
        this.colegio = colegio;
    }
    

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    @Override
    public String toString() {
        return super.toString() + "Medico{" + "colegio=" + colegio + '}';
    }
    
    
}
