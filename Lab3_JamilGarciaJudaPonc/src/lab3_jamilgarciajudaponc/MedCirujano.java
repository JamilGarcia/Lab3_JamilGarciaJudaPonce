package lab3_jamilgarciajudaponc;

public class MedCirujano extends Medico{
    
    private int NCirujias;

    public MedCirujano() {
    }

    public MedCirujano(String colegio) {
        super(colegio);
    }

    public int getNCirujias() {
        return NCirujias;
    }

    public void setNCirujias(int NCirujias) {
        this.NCirujias = NCirujias;
    }

    @Override
    public String toString() {
        return "MedCirujano{" + "NCirujias=" + NCirujias + '}';
    }
    
    
}
