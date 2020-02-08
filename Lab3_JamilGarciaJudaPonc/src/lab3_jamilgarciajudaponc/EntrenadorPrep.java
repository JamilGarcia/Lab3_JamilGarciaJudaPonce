package lab3_jamilgarciajudaponc;

public class EntrenadorPrep extends Entrenador {

    private int salario;

    public EntrenadorPrep() {
    }


    public EntrenadorPrep(int salario, String Jugo, String jugadaFav, String nombre, String apellido, int anios) {
        super(Jugo, jugadaFav, nombre, apellido, anios, salario);

    }

    @Override
    public String toString() {
        return super.toString() + "EntrenadorPrep{" + "salario=" + salario + '}';
    }
    
    
    
  

 

}
