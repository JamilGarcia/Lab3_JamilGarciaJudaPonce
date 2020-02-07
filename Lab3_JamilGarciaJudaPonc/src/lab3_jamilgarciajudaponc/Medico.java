package lab3_jamilgarciajudaponc;

public class Medico {
    
    private String colegio;

    public Medico() {
        super();
    }
    

    public Medico(String colegio) {
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
        return "Medico{" + "colegio=" + colegio + '}';
    }
    
    
}
