package lab3_jamilgarciajudaponc;

public class MedTera extends Medico {
    
    private int NTerapias;

    public MedTera() {
    }

    public MedTera(String colegio) {
        super(colegio);
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
