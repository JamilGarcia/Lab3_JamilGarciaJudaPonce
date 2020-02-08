
package lab3_jamilgarciajudaponc;

public class EntradorAsis extends Entrenador{
    
    private int salario;

    public EntradorAsis() {
    }


    public EntradorAsis(int salario, String Jugo, String jugadaFav, String nombre, String apellido, int anios) {
        super(Jugo, jugadaFav, nombre, apellido, anios, salario);
        this.salario = salario;

        }

    @Override
    public String toString() {
        return super.toString()+ "EntradorAsis{" + "salario=" + salario + '}';
    }
    
    
    
    
}
