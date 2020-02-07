package lab3_jamilgarciajudaponc;

public class MedGeneral extends Medico{
    
    private int NEnfreme;

    public MedGeneral() {
    }

    public MedGeneral(String colegio) {
        super(colegio);
    }

    public int getNEnfreme() {
        return NEnfreme;
    }

    public void setNEnfreme(int NEnfreme) {
        this.NEnfreme = NEnfreme;
    }

    @Override
    public String toString() {
        return super.toString() + "MedGeneral{" + "NEnfreme=" + NEnfreme + '}';
    }
     
    
    
}
