package lab3_jamilgarciajudaponc;

public class MedGeneral extends Medico {

    private int NEnfreme;


    public MedGeneral() {

    }

    public MedGeneral(int NEnfreme, String colegio, String nombre, String apellido, int anios, double salario) {
        super(colegio, nombre, apellido, anios, salario);
        this.NEnfreme = NEnfreme;
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
