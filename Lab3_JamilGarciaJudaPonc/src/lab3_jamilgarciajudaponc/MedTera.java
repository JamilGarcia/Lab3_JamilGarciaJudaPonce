package lab3_jamilgarciajudaponc;

public class MedTera extends Medico {
    
    private int NTerapias = 0;

    public MedTera() {
    }

    public MedTera(int NTerapias, String colegio, String nombre, String apellido, int anios, double salario) {
        super(colegio, nombre, apellido, anios, salario);
        this.NTerapias = NTerapias;
    }

    

    public int getNTerapias() {
        return NTerapias;
    }

    public void setNTerapias(int NTerapias) {
        this.NTerapias = NTerapias;
    }

    @Override
    public String toString() {
        return super.toString() + "MedTera{" + "NTerapias=" + NTerapias + '}';
    }
    
}
