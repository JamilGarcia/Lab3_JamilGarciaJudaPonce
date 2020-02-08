
package lab3_jamilgarciajudaponc;

public class EntradorAsis extends Entrenador{
    
    private int salario;

    public EntradorAsis() {
    }

    public EntradorAsis(String Jugo, Jugadas jugada) {
        super(Jugo, jugada);
    }

    @Override
    public String toString() {
        return super.toString()+ "EntradorAsis{" + "salario=" + salario + '}';
    }
    
    
    
    
}
