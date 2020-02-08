package lab3_jamilgarciajudaponc;

public class EntrenadorPrin extends Entrenador{
    private int salario; 

    public EntrenadorPrin() {
    }

    public EntrenadorPrin(int salario, String Jugo, String jugadaFav, String nombre, String apellido, int anios) {
        super(Jugo, jugadaFav, nombre, apellido, anios, salario);
        this.salario = salario;
    }

  

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + "EntrenadorPrin{" + "salario=" + salario + '}';
    }
    
    
    
}
