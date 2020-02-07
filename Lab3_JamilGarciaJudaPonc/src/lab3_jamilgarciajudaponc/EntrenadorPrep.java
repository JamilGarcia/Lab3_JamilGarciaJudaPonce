package lab3_jamilgarciajudaponc;


public class EntrenadorPrep {
    
    private int salario;

    public EntrenadorPrep() {
    }

    public EntrenadorPrep(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "EntrenadorPrep{" + "salario=" + salario + '}';
    }
    
    
}
