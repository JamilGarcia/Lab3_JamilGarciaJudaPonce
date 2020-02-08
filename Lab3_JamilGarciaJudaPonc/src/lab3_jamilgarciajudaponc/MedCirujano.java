package lab3_jamilgarciajudaponc;

public class MedCirujano extends Medico{
    
    private int NCirujias;

    public MedCirujano() {
    }

    public MedCirujano(int NCirujias, String colegio, String nombre, String apellido, int anios, double salario) {
        super(colegio, nombre, apellido, anios, salario);
        this.NCirujias = NCirujias;
    }

 

    public int getNCirujias() {
        return NCirujias;
    }

    public void setNCirujias(int NCirujias) {
        this.NCirujias = NCirujias;
    }

    @Override
    public String toString() {
        return super.toString() + "MedCirujano{" + "NCirujias=" + NCirujias + '}';
    }
    
    
}
